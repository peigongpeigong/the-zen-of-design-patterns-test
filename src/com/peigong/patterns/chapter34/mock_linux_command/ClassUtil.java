package com.peigong.patterns.chapter34.mock_linux_command;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author: lilei
 * @create: 2020-05-25 11:16
 **/
public class ClassUtil {

    public static List<Class> getSonClass(Class father) {
        List<Class> returnClass = new ArrayList<>();
        String packageName = father.getPackage().getName();
        List<Class> classes = getClasses(packageName);
        for (Class c : classes) {
            if (father.isAssignableFrom(c) && !father.equals(c)) {
                returnClass.add(c);
            }
        }
        return returnClass;
    }

    private static List<Class> getClasses(String packageName) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = null;
        try {
            resources = classLoader.getResources(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<File> dirs = new ArrayList<>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        List<Class> classes = new ArrayList<>();
        for (File dir : dirs) {
            classes.addAll(findClasses(dir, packageName));
        }
        return classes;
    }

    private static List<Class> findClasses(File dir, String packageName) {
        List<Class> classes = new ArrayList<>();
        if (!dir.exists()) {
            return classes;
        }
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                try {
                    classes.add(Class.forName(packageName + "." + file.getName().replaceAll(".class","")));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return classes;
    }

}

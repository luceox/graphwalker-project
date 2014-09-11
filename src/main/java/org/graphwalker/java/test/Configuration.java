package org.graphwalker.java.test;

/*
 * #%L
 * GraphWalker Java
 * %%
 * Copyright (C) 2011 - 2014 GraphWalker
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Nils Olsson
 */
public final class Configuration {

    private final static Set<String> DEFAULT = Collections.unmodifiableSet(new HashSet<>(Arrays.asList("*")));

    private Set<String> includes = new HashSet<>();
    private Set<String> excludes = new HashSet<>();
    private File testClassesDirectory = new File("target/test-classes");
    private File classesDirectory = new File("target/classes");
    private File reportsDirectory = new File("target/graphwalker-reports");
    private Set<String> groups = new HashSet<>();

    public Set<String> getIncludes() {
        return includes.isEmpty()?DEFAULT:Collections.unmodifiableSet(includes);
    }

    public Configuration addInclude(String include) {
        includes.add(include);
        return this;
    }

    public Configuration addInclude(Set<String> include) {
        includes.addAll(include);
        return this;
    }

    public Set<String> getExcludes() {
        return Collections.unmodifiableSet(excludes);
    }

    public Configuration addExclude(String exclude) {
        excludes.add(exclude);
        return this;
    }

    public Configuration addExclude(Set<String> exclude) {
        excludes.addAll(exclude);
        return this;
    }

    public File getTestClassesDirectory() {
        return testClassesDirectory;
    }

    public Configuration setTestClassesDirectory(File testClassesDirectory) {
        this.testClassesDirectory = testClassesDirectory;
        return this;
    }

    public File getClassesDirectory() {
        return classesDirectory;
    }

    public Configuration setClassesDirectory(File classesDirectory) {
        this.classesDirectory = classesDirectory;
        return this;
    }

    public File getReportsDirectory() {
        return reportsDirectory;
    }

    public Configuration setReportsDirectory(File reportsDirectory) {
        this.reportsDirectory = reportsDirectory;
        return this;
    }

    public Set<String> getGroups() {
        return groups.isEmpty()?DEFAULT:Collections.unmodifiableSet(groups);
    }

    public Configuration addGroup(String group) {
        groups.add(group);
        return this;
    }
}

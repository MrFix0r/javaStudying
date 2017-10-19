package com.bivgroup.annotationTest;

import java.lang.annotation.Repeatable;

@Repeatable(testAnnotations.class)
public @interface testAnnotation {
    String value();
}

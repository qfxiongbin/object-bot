package com.github.dreamhead.bot.annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Repeatable(value = AnyFields.class)
public @interface AnyField {
    String name();
    Class<? extends FieldFactory<?>> factory();
}

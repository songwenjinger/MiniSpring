package com.minis.beans;

/**
 * BeanDefinition集中管理仓库
 * @Date：2024/3/16 13:28
 * @Description
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String name, BeanDefinition bd);
    void removeBeanDefinition(String name);
    BeanDefinition getBeanDefinition(String name);
    boolean containsBeanDefinition(String name);
}

package com.microsoft.azure.elasticdb.shard.stubhelper;

/*
 * Copyright (c) Microsoft. All rights reserved. Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

@FunctionalInterface
public interface Func8Param<T1, T2, T3, T4, T5, T6, T7, T8, ResultT> {

    ResultT invoke(T1 t1,
            T2 t2,
            T3 t3,
            T4 t4,
            T5 t5,
            T6 t6,
            T7 t7,
            T8 t8);
}
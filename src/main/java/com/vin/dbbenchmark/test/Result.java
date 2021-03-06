/*
 * Copyright 2016 Vincenzo Micelli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vin.dbbenchmark.test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The result object extends a {@code LinkedHashMap}.
 * The keys are strings that represent a description for the time in the corresponding value.
 * The Value is a {@code long} that represents a time in nanoseconds.
 * Instances of key-value pairs are:<br>
 *  - min 23023<br>
 *  - max 67322<br>
 *  - avg 38099
 * 
 * @author Vincenzo Micelli
 */
public class Result extends LinkedHashMap<String,Long>{
    
    /**
     * Print result times and their descriptions
     */
    public void print()
    {
        for (Map.Entry entry : entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ns/op");
        }
    }
    
}

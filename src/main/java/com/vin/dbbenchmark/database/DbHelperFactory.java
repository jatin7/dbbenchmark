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
package com.vin.dbbenchmark.database;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * 
 * @author Vincenzo Micelli
 */
public class DbHelperFactory {
    
    public static DbHelper getDbHelper(DBMSName dbmsName)
    {
        DbHelper dbHelper;
        
        switch (dbmsName) {
            case SQL_SERVER: 
                dbHelper = new SqlServerDbHelper();
                break;

            case POSTGRE_SQL: 
                dbHelper = new PostgreSqlDbHelper();
                break;
                
            default: 
                dbHelper = null;
                Logger.getLogger(DbHelperFactory.class.getName()).log(Level.SEVERE, "database must be one between sql server and postgre sql.");
                break;
        }
        
        return dbHelper;

    }
}

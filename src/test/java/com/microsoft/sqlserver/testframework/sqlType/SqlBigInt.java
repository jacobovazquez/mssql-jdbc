/*
 * Microsoft JDBC Driver for SQL Server
 * 
 * Copyright(c) Microsoft Corporation All rights reserved.
 * 
 * This program is made available under the terms of the MIT License. See the LICENSE file in the project root for more information.
 */

package com.microsoft.sqlserver.testframework.sqlType;

import java.sql.JDBCType;
import java.util.concurrent.ThreadLocalRandom;

public class SqlBigInt extends SqlNumber {

    public SqlBigInt() {
        super("bigint", JDBCType.BIGINT, 19, 0, SqlTypeValue.BIGINT.minValue, SqlTypeValue.BIGINT.maxValue, SqlTypeValue.BIGINT.nullValue);
    }

    public Object createdata() {
        // TODO: include max value
        return new Long(ThreadLocalRandom.current().nextLong(Long.MIN_VALUE, Long.MAX_VALUE));
    }
}
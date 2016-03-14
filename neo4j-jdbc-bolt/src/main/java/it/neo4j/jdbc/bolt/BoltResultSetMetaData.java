/**
 * Copyright (c) 2016 LARUS Business Automation [http://www.larus-ba.it]
 * <p>
 * This file is part of the "LARUS Integration Framework for Neo4j".
 * <p>
 * The "LARUS Integration Framework for Neo4j" is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created on 17/02/16
 */
package it.neo4j.jdbc.bolt;

import it.neo4j.jdbc.ResultSetMetaData;
import org.mockito.Mockito;
import org.neo4j.driver.v1.ResultCursor;

import java.sql.SQLException;

/**
 * @author AgileLARUS
 * @since 3.0.0
 */
public class BoltResultSetMetaData extends ResultSetMetaData {

	ResultCursor cursor = null;
	boolean      debug  = false;

	public static BoltResultSetMetaData istantiate(ResultCursor cursor, boolean debug) {
		BoltResultSetMetaData boltResultSetMetaData = null;

		if (debug) {
			boltResultSetMetaData = Mockito.mock(BoltResultSetMetaData.class,
					Mockito.withSettings().useConstructor().outerInstance(cursor).verboseLogging().defaultAnswer(Mockito.CALLS_REAL_METHODS));
			boltResultSetMetaData.debug = debug;
		} else {
			boltResultSetMetaData = new BoltResultSetMetaData(cursor);
		}

		return boltResultSetMetaData;
	}

	BoltResultSetMetaData(ResultCursor cursor) {
		this.cursor = cursor;
	}

	@Override public int getColumnCount() throws SQLException {
		if (this.cursor == null) {
			throw new SQLException("The ResultCursor is null");
		}
		return this.cursor.size();
	}

	@Override public String getColumnLabel(int column) throws SQLException {
		return this.getColumnName(column);
	}

	@Override public String getColumnName(int column) throws SQLException {
		if (this.cursor == null) {
			throw new SQLException("The ResultCursor is null");
		}
		if (column > this.cursor.size() || column < 1) {
			throw new SQLException("Column out of range");
		}
		return this.cursor.keys().get(column - 1);
	}
}

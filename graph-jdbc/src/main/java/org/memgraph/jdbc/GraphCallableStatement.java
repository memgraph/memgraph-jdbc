/*
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
 * Created on 03/02/16
 */
package org.memgraph.jdbc;

import org.memgraph.jdbc.utils.ExceptionBuilder;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.Map;

/**
 * @author AgileLARUS
 * @since 3.0.0
 */
public abstract class GraphCallableStatement extends GraphPreparedStatement implements java.sql.CallableStatement {

	/**
	 * Default constructor with connection and statement.
	 *
	 * @param connection   The JDBC connection
	 * @param rawStatement The prepared statement
	 */
	protected GraphCallableStatement(GraphConnection connection, String rawStatement) {
		super(connection, rawStatement);
	}

	/*---------------------------------------*/
	/*       Some useful check method        */
	/*---------------------------------------*/

	/**
	 * Check if this connection is closed or not.
	 * If it's closed, then we throw a SQLException, otherwise we do nothing.
	 * @throws SQLException sqlexception
	 */
	protected void checkClosed() throws SQLException {
		if (this.isClosed()) {
			throw new SQLException("CallableStatement already closed");
		}
	}

	/*------------------------------------*/
	/*       Default implementation       */
	/*------------------------------------*/

	@Override public SQLWarning getWarnings() throws SQLException {
		checkClosed();
		return null;
	}

	@Override public void clearWarnings() throws SQLException {
		checkClosed();
	}

	/*---------------------------------*/
	/*       Not implemented yet       */
	/*---------------------------------*/

	@Override public void registerOutParameter(int parameterIndex, int sqlType) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void registerOutParameter(int parameterIndex, int sqlType, int scale) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean wasNull() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public String getString(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean getBoolean(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public byte getByte(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public short getShort(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getInt(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public long getLong(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public float getFloat(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public double getDouble(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public BigDecimal getBigDecimal(int parameterIndex, int scale) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public byte[] getBytes(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Date getDate(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Time getTime(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Timestamp getTimestamp(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Object getObject(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public BigDecimal getBigDecimal(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Object getObject(int parameterIndex, Map<String, Class<?>> map) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Ref getRef(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Blob getBlob(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Clob getClob(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public GraphArray getArray(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Date getDate(int parameterIndex, Calendar cal) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Time getTime(int parameterIndex, Calendar cal) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Timestamp getTimestamp(int parameterIndex, Calendar cal) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void registerOutParameter(int parameterIndex, int sqlType, String typeName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void registerOutParameter(String parameterName, int sqlType) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void registerOutParameter(String parameterName, int sqlType, int scale) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void registerOutParameter(String parameterName, int sqlType, String typeName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public URL getURL(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setURL(String parameterName, URL val) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setNull(String parameterName, int sqlType) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBoolean(String parameterName, boolean x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setByte(String parameterName, byte x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setShort(String parameterName, short x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setInt(String parameterName, int x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setLong(String parameterName, long x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setFloat(String parameterName, float x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setDouble(String parameterName, double x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setString(String parameterName, String x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBytes(String parameterName, byte[] x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setDate(String parameterName, Date x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setTime(String parameterName, Time x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setObject(String parameterName, Object x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setCharacterStream(String parameterName, Reader reader, int length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public String getString(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean getBoolean(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public byte getByte(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public short getShort(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getInt(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public long getLong(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public float getFloat(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public double getDouble(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public byte[] getBytes(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Date getDate(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Time getTime(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Timestamp getTimestamp(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Object getObject(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public BigDecimal getBigDecimal(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Object getObject(String parameterName, Map<String, Class<?>> map) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Ref getRef(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Blob getBlob(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Clob getClob(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public GraphArray getArray(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Date getDate(String parameterName, Calendar cal) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Time getTime(String parameterName, Calendar cal) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Timestamp getTimestamp(String parameterName, Calendar cal) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public URL getURL(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public RowId getRowId(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public RowId getRowId(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setRowId(String parameterName, RowId x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setNString(String parameterName, String value) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setNCharacterStream(String parameterName, Reader value, long length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setNClob(String parameterName, NClob value) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setClob(String parameterName, Reader reader, long length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBlob(String parameterName, InputStream inputStream, long length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setNClob(String parameterName, Reader reader, long length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public NClob getNClob(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public NClob getNClob(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setSQLXML(String parameterName, SQLXML xmlObject) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public SQLXML getSQLXML(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public SQLXML getSQLXML(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public String getNString(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public String getNString(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Reader getNCharacterStream(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Reader getNCharacterStream(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Reader getCharacterStream(int parameterIndex) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public Reader getCharacterStream(String parameterName) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBlob(String parameterName, Blob x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setClob(String parameterName, Clob x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setAsciiStream(String parameterName, InputStream x, long length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBinaryStream(String parameterName, InputStream x, long length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setCharacterStream(String parameterName, Reader reader, long length) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setAsciiStream(String parameterName, InputStream x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBinaryStream(String parameterName, InputStream x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setCharacterStream(String parameterName, Reader reader) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setNCharacterStream(String parameterName, Reader value) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setClob(String parameterName, Reader reader) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBlob(String parameterName, InputStream inputStream) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setNClob(String parameterName, Reader reader) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public <T> T getObject(int parameterIndex, Class<T> type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public <T> T getObject(String parameterName, Class<T> type) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public ResultSet executeQuery() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int executeUpdate() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setNull(int parameterIndex, int sqlType) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBoolean(int parameterIndex, boolean x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setByte(int parameterIndex, byte x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setShort(int parameterIndex, short x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setInt(int parameterIndex, int x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setLong(int parameterIndex, long x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setFloat(int parameterIndex, float x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setDouble(int parameterIndex, double x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setObject(int parameterIndex, Object x) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean execute() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public ResultSet executeQuery(String sql) throws SQLException {
		throw new SQLException("Method executeQuery(String) cannot be called on PreparedStatement");
	}

	@Override public int executeUpdate(String sql) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void close() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getMaxFieldSize() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setMaxFieldSize(int max) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getMaxRows() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setMaxRows(int max) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setEscapeProcessing(boolean enable) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getQueryTimeout() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setQueryTimeout(int seconds) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void cancel() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setCursorName(String name) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean execute(String sql) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public ResultSet getResultSet() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getUpdateCount() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean getMoreResults() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setFetchDirection(int direction) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getFetchDirection() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setFetchSize(int rows) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getFetchSize() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getResultSetConcurrency() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int getResultSetType() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void addBatch(String sql) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void clearBatch() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public int[] executeBatch() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean getMoreResults(int current) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean isClosed() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void setPoolable(boolean poolable) throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean isPoolable() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public void closeOnCompletion() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public boolean isCloseOnCompletion() throws SQLException {
		throw ExceptionBuilder.buildUnsupportedOperationException();
	}

	@Override public <T> T unwrap(Class<T> iface) throws SQLException {
		return org.memgraph.jdbc.Wrapper.unwrap(iface, this);
	}

	@Override public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return org.memgraph.jdbc.Wrapper.isWrapperFor(iface, this.getClass());
	}
}

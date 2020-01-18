/*
 * Copyright (c) 2018 datagear.tech. All Rights Reserved.
 */

/**
 * 
 */
package org.datagear.analysis;

import java.io.Serializable;

/**
 * 数据集输出项。
 * <p>
 * 此类描述{@linkplain DataSetFactory}创建的{@linkplain DataSet}可输出的数据信息。
 * </p>
 * 
 * @author datagear@163.com
 *
 */
public abstract class DataSetExport extends DataNameAndType implements Serializable
{
	private static final long serialVersionUID = 1L;

	public DataSetExport()
	{
		super();
	}

	public DataSetExport(String name, DataType type)
	{
		super(name, type);
	}

	/**
	 * 获取输出项值。
	 * 
	 * @param dataSetFactory
	 * @param dataSet
	 * @return
	 * @throws DataSetException
	 */
	public abstract Object getExportValue(DataSetFactory dataSetFactory, DataSet dataSet) throws DataSetException;

	@Override
	public String toString()
	{
		return getClass().getSimpleName() + " [name=" + getName() + ", type=" + getType() + "]";
	}
}

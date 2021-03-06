/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
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

package com.tectonica.jonix;

/**
 * A helper class, turning a given set of {@link JonixColumn}s into a tab-delimited string ready for writing into a
 * file.
 * 
 * @author Zach Melamed
 */
public class JonixTabulator<H, P>
{
	/**
	 * generates a tab-delimited string, representing the <b>headers</b> of the columns, as specified in the provided
	 * array of {@link JonixColumn}s
	 */
	public static <H, P> String headerAsTabDelimitedString(JonixColumn<P>[] columns)
	{
		StringBuilder sb = new StringBuilder();
		for (JonixColumn<P> column : columns)
		{
			int repetition = column.getRepetitions();
			for (int i = 0; i < repetition; i++)
			{
				String[] subColumnNames = column.getSubColumnNames();
				for (int j = 0; j < subColumnNames.length; j++)
				{
					sb.append(subColumnNames[j]);
					if (repetition > 1)
						sb.append(".").append(i + 1);
					sb.append("\t");
				}
			}
		}
		return sb.toString();
	}

	/**
	 * turns a Product object into a tab-delimited string, whose columns are defined by the provided array of
	 * {@link JonixColumn}s
	 */
	public static <H, P> String productAsTabDelimitedString(P product, JonixColumn<P>[] columns)
	{
		String[][] prodMatrix = productAsStringMatrix(product, columns);

		// generate the tab-delimited row of text from the jagged-array
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < prodMatrix.length; i++)
		{
			for (int j = 0; j < prodMatrix[i].length; j++)
			{
				String item = prodMatrix[i][j];
				if (item == null)
					sb.append("");
				else
					sb.append(item.replaceAll("\\t|\\n|\\r", " "));
				sb.append("\t");
			}
		}
		return sb.toString();
	}

	/**
	 * turns a Product object into a jagged-array of Strings, whose amount of rows and columns are defined by the
	 * provided array of {@link JonixColumn}s
	 */
	public static <H, P> String[][] productAsStringMatrix(P product, JonixColumn<P>[] columns)
	{
		// prepare the resulting jagged-array of values
		String[][] prodMatrix = new String[columns.length][];

		// populate it by extracting information from the 'product' object
		for (int i = 0; i < columns.length; i++)
		{
			JonixColumn<P> column = columns[i];
			column.extractFrom(product, prodMatrix[i] = newColumnBuffer(column));
		}
		return prodMatrix;
	}

	public static <H, P> String[] newColumnBuffer(JonixColumn<P> column)
	{
		return new String[column.getRepetitions() * column.getSubColumnNames().length];
	}
}

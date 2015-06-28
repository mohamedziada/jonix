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

package com.tectonica.jonix.basic;

import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.codelist.TitleTypes;

/**
 * A {@link List} containing the multiple instances of ONIX2 &lt;Series&gt; / ONIX3 &lt;Collection&gt; that may exist in
 * a product
 * 
 * @author Zach Melamed
 */
public class BasicTitles extends ArrayList<BasicTitle>
{
	private static final long serialVersionUID = 1L;

	public BasicTitles(com.tectonica.jonix.onix2.Product product)
	{
		extractFrom2(product.titles);
	}

	public BasicTitles(com.tectonica.jonix.onix2.Series series)
	{
		extractFrom2(series.titles);
	}

	public BasicTitles(com.tectonica.jonix.onix3.Product product)
	{
		if (product.descriptiveDetail != null)
			extractFrom3(product.descriptiveDetail.titleDetails);
	}

	public BasicTitles(com.tectonica.jonix.onix3.Collection collection)
	{
		extractFrom3(collection.titleDetails);
	}

	private void extractFrom2(final List<com.tectonica.jonix.onix2.Title> titles)
	{
		if (titles != null)
		{
			for (com.tectonica.jonix.onix2.Title title : titles)
				add(new BasicTitle(title));
		}
	}

	private void extractFrom3(final List<com.tectonica.jonix.onix3.TitleDetail> titles)
	{
		if (titles != null)
		{
			for (com.tectonica.jonix.onix3.TitleDetail title : titles)
				add(new BasicTitle(title));
		}
	}

	public BasicTitle findTitle(TitleTypes requestedType)
	{
		for (BasicTitle title : this)
		{
			if (title.titleType == requestedType)
				return title;
		}
		return null;
	}
}
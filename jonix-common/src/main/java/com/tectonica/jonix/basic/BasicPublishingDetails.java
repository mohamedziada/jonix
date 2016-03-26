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

import java.io.Serializable;
import java.util.Date;

import com.tectonica.jonix.JonixUtil;
import com.tectonica.jonix.codelist.CountryCodes;

/**
 * Bundles together some publishing-related information included in an ONIX product
 * <p>
 * NOTE: to access the information, use the public fields directly. No getters() are included..
 * 
 * @author Zach Melamed
 */
@SuppressWarnings("serial")
public abstract class BasicPublishingDetails implements Serializable
{
	public String publicationDate;
	public String outOfPrintDate;
	public CountryCodes countryOfPublication;
	public String cityOfPublication;

	public Date getPublicationDate()
	{
		// TODO: the 'publicationDate' maybe in other formats than YYYYMMDD (which is <DateFormat>00</DateFormat>)
		return JonixUtil.parseYYYYMMDD(publicationDate);
	}

	public Date getOutOfPrintDate()
	{
		// TODO: the 'publicationDate' maybe in other formats than YYYYMMDD (which is <DateFormat>00</DateFormat>)
		return JonixUtil.parseYYYYMMDD(outOfPrintDate);
	}
}

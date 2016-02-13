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

package com.tectonica.jonix.codelist;

import java.util.HashMap;
import java.util.Map;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 38</b>
 * <p>
 * Description: Image/audio/video file type code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum ImageAudioVideoFileTypes
{
	/**
	 * Link to a location where the whole product may be found &#8211; used for epublications
	 */
	Whole_product("01", "Whole product"), //

	Application_software_demo("02", "Application: software demo"), //

	/**
	 * Includes cover, back cover, spine and &#8211; where appropriate &#8211; any flaps. Quality unspecified: if
	 * sending both a standard quality and a high quality image, use 03 for standard quality and 05 for high quality
	 */
	Image_whole_cover("03", "Image: whole cover"), //

	/**
	 * Quality unspecified: if sending both a standard quality and a high quality image, use 04 for standard quality and
	 * 06 for high quality
	 */
	Image_front_cover("04", "Image: front cover"), //

	/**
	 * Should have a minimum resolution of 300 dpi when rendered at the intended size for display or print
	 */
	Image_whole_cover_high_quality("05", "Image: whole cover, high quality"), //

	/**
	 * Should have a minimum resolution of 300 dpi when rendered at the intended size for display or print
	 */
	Image_front_cover_high_quality("06", "Image: front cover, high quality"), //

	Image_front_cover_thumbnail("07", "Image: front cover thumbnail"), //

	Image_contributor_s("08", "Image: contributor(s)"), //

	/**
	 * Use for an image, other than a logo, that is part of the &#8216;branding&#8217; of a series
	 */
	Image_for_series("10", "Image: for series"), //

	Image_series_logo("11", "Image: series logo"), //

	/**
	 * Use only for a logo which is specific to an individual product
	 */
	Image_product_logo("12", "Image: product logo"), //

	Image_Master_brand_logo("16", "Image: Master brand logo"), //

	Image_publisher_logo("17", "Image: publisher logo"), //

	Image_imprint_logo("18", "Image: imprint logo"), //

	Image_table_of_contents("22", "Image: table of contents"), //

	/**
	 * Use for inside page image for book, or screenshot for software or game (revised definition from Issue 8)
	 */
	Image_sample_content("23", "Image: sample content"), //

	/**
	 * Quality unspecified: if sending both a standard quality and a high quality image, use 24 for standard quality and
	 * 25 for high quality
	 */
	Image_back_cover("24", "Image: back cover"), //

	/**
	 * Should have a minimum resolution of 300 dpi when rendered at the intended size for display or print
	 */
	Image_back_cover_high_quality("25", "Image: back cover, high quality"), //

	Image_back_cover_thumbnail("26", "Image: back cover thumbnail"), //

	Image_other_cover_material("27", "Image: other cover material"), //

	Image_promotional_material("28", "Image: promotional material"), //

	Video_segment_unspecified("29", "Video segment: unspecified"), //

	Audio_segment_unspecified("30", "Audio segment: unspecified"), //

	Video_author_presentation_commentary("31", "Video: author presentation / commentary"), //

	Video_author_interview("32", "Video: author interview"), //

	Video_author_reading("33", "Video: author reading"), //

	Video_cover_material("34", "Video: cover material"), //

	Video_sample_content("35", "Video: sample content"), //

	Video_promotional_material("36", "Video: promotional material"), //

	Video_review("37", "Video: review"), //

	Video_other_commentary_discussion("38", "Video: other commentary / discussion"), //

	Audio_author_presentation_commentary("41", "Audio: author presentation / commentary"), //

	Audio_author_interview("42", "Audio: author interview"), //

	Audio_author_reading("43", "Audio: author reading"), //

	Audio_sample_content("44", "Audio: sample content"), //

	Audio_promotional_material("45", "Audio: promotional material"), //

	Audio_review("46", "Audio: review"), //

	Audio_other_commentary_discussion("47", "Audio: other commentary / discussion"), //

	/**
	 * Use for &#8216;look inside&#8217; facility or &#8216;widget&#8217;
	 */
	Application_sample_content("51", "Application: sample content"), //

	Application_promotional_material("52", "Application: promotional material");

	public final String value;
	public final String label;

	private ImageAudioVideoFileTypes(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	private static Map<String, ImageAudioVideoFileTypes> map;

	private static Map<String, ImageAudioVideoFileTypes> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (ImageAudioVideoFileTypes e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static ImageAudioVideoFileTypes byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}

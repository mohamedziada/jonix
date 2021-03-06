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

package com.tectonica.jonix.onix2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.ImageAudioVideoFileTypes;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.OtherTextTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TitleTypes;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.codelist.WorkIdentifierTypes;
import com.tectonica.jonix.struct.JonixMediaFile;
import com.tectonica.jonix.struct.JonixOtherText;
import com.tectonica.jonix.struct.JonixTitle;
import com.tectonica.jonix.struct.JonixWorkIdentifier;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Content item composite</h1>
 * <p>
 * A repeatable group of data elements which together describe a content item within a product.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;ContentItem&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;contentitem&gt;</td>
 * </tr>
 * </table>
 */
public class ContentItem implements OnixSuperComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "ContentItem";
	public static final String shortname = "contentitem";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	public TextFormats textformat;

	public TextCaseFlags textcase;

	public LanguageCodes language;

	public TransliterationSchemes transliteration;

	/**
	 * (type: DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// MEMBERS
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (this field is optional)
	 */
	public LevelSequenceNumber levelSequenceNumber;

	/**
	 * (this field is required)
	 */
	public TextItem textItem;

	/**
	 * (this list may be empty)
	 */
	public List<Website> websites;

	/**
	 * (this field is required)
	 */
	public ComponentTypeName componentTypeName;

	/**
	 * (this field is optional)
	 */
	public ComponentNumber componentNumber;

	/**
	 * (this field is optional)
	 */
	public DistinctiveTitle distinctiveTitle;

	/**
	 * (this list may be empty)
	 */
	public List<Title> titles;

	/**
	 * (this list may be empty)
	 */
	public List<WorkIdentifier> workIdentifiers;

	/**
	 * (this list may be empty)
	 */
	public List<Contributor> contributors;

	/**
	 * (this field is optional)
	 */
	public ContributorStatement contributorStatement;

	/**
	 * (this list may be empty)
	 */
	public List<Subject> subjects;

	/**
	 * (this list may be empty)
	 */
	public List<PersonAsSubject> personAsSubjects;

	/**
	 * (this list may be empty)
	 */
	public List<CorporateBodyAsSubject> corporateBodyAsSubjects;

	/**
	 * (this list may be empty)
	 */
	public List<PlaceAsSubject> placeAsSubjects;

	/**
	 * (this list may be empty)
	 */
	public List<OtherText> otherTexts;

	/**
	 * (this list may be empty)
	 */
	public List<MediaFile> mediaFiles;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public ContentItem()
	{}

	public ContentItem(org.w3c.dom.Element element)
	{
		textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(LevelSequenceNumber.refname) || name.equals(LevelSequenceNumber.shortname))
					levelSequenceNumber = new LevelSequenceNumber(element);
				else if (name.equals(TextItem.refname) || name.equals(TextItem.shortname))
					textItem = new TextItem(element);
				else if (name.equals(Website.refname) || name.equals(Website.shortname))
					websites = JPU.addToList(websites, new Website(element));
				else if (name.equals(ComponentTypeName.refname) || name.equals(ComponentTypeName.shortname))
					componentTypeName = new ComponentTypeName(element);
				else if (name.equals(ComponentNumber.refname) || name.equals(ComponentNumber.shortname))
					componentNumber = new ComponentNumber(element);
				else if (name.equals(DistinctiveTitle.refname) || name.equals(DistinctiveTitle.shortname))
					distinctiveTitle = new DistinctiveTitle(element);
				else if (name.equals(Title.refname) || name.equals(Title.shortname))
					titles = JPU.addToList(titles, new Title(element));
				else if (name.equals(WorkIdentifier.refname) || name.equals(WorkIdentifier.shortname))
					workIdentifiers = JPU.addToList(workIdentifiers, new WorkIdentifier(element));
				else if (name.equals(Contributor.refname) || name.equals(Contributor.shortname))
					contributors = JPU.addToList(contributors, new Contributor(element));
				else if (name.equals(ContributorStatement.refname) || name.equals(ContributorStatement.shortname))
					contributorStatement = new ContributorStatement(element);
				else if (name.equals(Subject.refname) || name.equals(Subject.shortname))
					subjects = JPU.addToList(subjects, new Subject(element));
				else if (name.equals(PersonAsSubject.refname) || name.equals(PersonAsSubject.shortname))
					personAsSubjects = JPU.addToList(personAsSubjects, new PersonAsSubject(element));
				else if (name.equals(CorporateBodyAsSubject.refname) || name.equals(CorporateBodyAsSubject.shortname))
					corporateBodyAsSubjects = JPU.addToList(corporateBodyAsSubjects,
							new CorporateBodyAsSubject(element));
				else if (name.equals(PlaceAsSubject.refname) || name.equals(PlaceAsSubject.shortname))
					placeAsSubjects = JPU.addToList(placeAsSubjects, new PlaceAsSubject(element));
				else if (name.equals(OtherText.refname) || name.equals(OtherText.shortname))
					otherTexts = JPU.addToList(otherTexts, new OtherText(element));
				else if (name.equals(MediaFile.refname) || name.equals(MediaFile.shortname))
					mediaFiles = JPU.addToList(mediaFiles, new MediaFile(element));
			}
		});
	}

	/**
	 * Raw Format: Variable-length string of integers, each successive integer being separated by a full stop, suggested
	 * maximum length 100 characters
	 */
	public String getLevelSequenceNumberValue()
	{
		return (levelSequenceNumber == null) ? null : levelSequenceNumber.value;
	}

	/**
	 * Raw Format: Variable-length alphanumeric, suggested maximum length 20 characters
	 */
	public String getComponentTypeNameValue()
	{
		return (componentTypeName == null) ? null : componentTypeName.value;
	}

	/**
	 * Raw Format: Variable-length alphanumeric, suggested maximum length 20 characters
	 */
	public String getComponentNumberValue()
	{
		return (componentNumber == null) ? null : componentNumber.value;
	}

	/**
	 * Raw Format: Variable-length alphanumeric, suggested maximum length 300 characters
	 */
	public String getDistinctiveTitleValue()
	{
		return (distinctiveTitle == null) ? null : distinctiveTitle.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 1000 characters
	 */
	public String getContributorStatementValue()
	{
		return (contributorStatement == null) ? null : contributorStatement.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum 200 characters.
	 */
	public List<String> getCorporateBodyAsSubjectValues()
	{
		if (corporateBodyAsSubjects != null)
		{
			List<String> list = new ArrayList<>();
			for (CorporateBodyAsSubject i : corporateBodyAsSubjects)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum 100 characters.
	 */
	public List<String> getPlaceAsSubjectValues()
	{
		if (placeAsSubjects != null)
		{
			List<String> list = new ArrayList<>();
			for (PlaceAsSubject i : placeAsSubjects)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public JonixTitle findTitle(TitleTypes titleType)
	{
		if (titles != null)
		{
			for (Title x : titles)
			{
				if (x.getTitleTypeValue() == titleType)
					return x.asJonixTitle();
			}
		}
		return null;
	}

	public List<JonixTitle> findTitles(java.util.Set<TitleTypes> titleTypes)
	{
		if (titles != null)
		{
			List<JonixTitle> matches = new ArrayList<>();
			for (Title x : titles)
			{
				if (titleTypes == null || titleTypes.contains(x.getTitleTypeValue()))
					matches.add(x.asJonixTitle());
			}
			return matches;
		}
		return null;
	}

	public JonixWorkIdentifier findWorkIdentifier(WorkIdentifierTypes workIDType)
	{
		if (workIdentifiers != null)
		{
			for (WorkIdentifier x : workIdentifiers)
			{
				if (x.getWorkIDTypeValue() == workIDType)
					return x.asJonixWorkIdentifier();
			}
		}
		return null;
	}

	public List<JonixWorkIdentifier> findWorkIdentifiers(java.util.Set<WorkIdentifierTypes> workIDTypes)
	{
		if (workIdentifiers != null)
		{
			List<JonixWorkIdentifier> matches = new ArrayList<>();
			for (WorkIdentifier x : workIdentifiers)
			{
				if (workIDTypes == null || workIDTypes.contains(x.getWorkIDTypeValue()))
					matches.add(x.asJonixWorkIdentifier());
			}
			return matches;
		}
		return null;
	}

	public JonixOtherText findOtherText(OtherTextTypes textTypeCode)
	{
		if (otherTexts != null)
		{
			for (OtherText x : otherTexts)
			{
				if (x.getTextTypeCodeValue() == textTypeCode)
					return x.asJonixOtherText();
			}
		}
		return null;
	}

	public List<JonixOtherText> findOtherTexts(java.util.Set<OtherTextTypes> textTypeCodes)
	{
		if (otherTexts != null)
		{
			List<JonixOtherText> matches = new ArrayList<>();
			for (OtherText x : otherTexts)
			{
				if (textTypeCodes == null || textTypeCodes.contains(x.getTextTypeCodeValue()))
					matches.add(x.asJonixOtherText());
			}
			return matches;
		}
		return null;
	}

	public JonixMediaFile findMediaFile(ImageAudioVideoFileTypes mediaFileTypeCode)
	{
		if (mediaFiles != null)
		{
			for (MediaFile x : mediaFiles)
			{
				if (x.getMediaFileTypeCodeValue() == mediaFileTypeCode)
					return x.asJonixMediaFile();
			}
		}
		return null;
	}

	public List<JonixMediaFile> findMediaFiles(java.util.Set<ImageAudioVideoFileTypes> mediaFileTypeCodes)
	{
		if (mediaFiles != null)
		{
			List<JonixMediaFile> matches = new ArrayList<>();
			for (MediaFile x : mediaFiles)
			{
				if (mediaFileTypeCodes == null || mediaFileTypeCodes.contains(x.getMediaFileTypeCodeValue()))
					matches.add(x.asJonixMediaFile());
			}
			return matches;
		}
		return null;
	}
}

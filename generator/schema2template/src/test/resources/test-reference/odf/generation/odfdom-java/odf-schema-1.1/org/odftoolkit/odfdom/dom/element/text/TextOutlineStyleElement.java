/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;

/**
 * DOM implementation of OpenDocument element  {@odf.element text:outline-style}.
 *
 */
public class TextOutlineStyleElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "outline-style");

	/**
	 * Create the instance of <code>TextOutlineStyleElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextOutlineStyleElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:outline-style}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element text:outline-level-style}.
	 *
	 * @param styleNumFormatValue  the <code>String</code> value of <code>StyleNumFormatAttribute</code>, see {@odf.attribute  style:num-format} at specification
	 * @param textLevelValue  the <code>Integer</code> value of <code>TextLevelAttribute</code>, see {@odf.attribute  text:level} at specification
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element text:outline-level-style}
	 */
	 public TextOutlineLevelStyleElement newTextOutlineLevelStyleElement(String styleNumFormatValue, int textLevelValue) {
		TextOutlineLevelStyleElement textOutlineLevelStyle = ((OdfFileDom) this.ownerDocument).newOdfElement(TextOutlineLevelStyleElement.class);
		textOutlineLevelStyle.setStyleNumFormatAttribute(styleNumFormatValue);
		textOutlineLevelStyle.setTextLevelAttribute(textLevelValue);
		this.appendChild(textOutlineLevelStyle);
		return textOutlineLevelStyle;
	}

  /**
   * Accept an visitor instance to allow the visitor to do some operations. Refer to visitor design
   * pattern to get a better understanding.
   *
   * @param visitor an instance of DefaultElementVisitor
   */
	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}
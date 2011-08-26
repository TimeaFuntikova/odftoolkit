/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 * 
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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

package org.openoffice.odf.dom.element.draw;

import org.openoffice.odf.dom.OdfName;
import org.openoffice.odf.dom.OdfNamespace;
import org.openoffice.odf.doc.OdfFileDom;
import org.openoffice.odf.dom.element.OdfElement;
import org.openoffice.odf.dom.type.OdfAnyURI;
import org.openoffice.odf.dom.type.office.OdfTargetFrameNameType;
import org.openoffice.odf.dom.type.xlink.OdfShowType;
import org.openoffice.odf.dom.type.OdfBoolean;


/**
 * ODF DOM Element implementation for element "<draw:a>".
 */
public abstract class OdfHyperlinkElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.DRAW, "a" );

    public OdfHyperlinkElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialite mandatory attributes.
     */
    public void init(String _aHref)
    {
        setHref( _aHref );
    }

    /**
     * Get value of attribute "xlink:href".
     */
    public String getHref()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ) );
        return OdfAnyURI.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "xlink:href".
     */
    public void setHref( String _aHref )
    {                    
        String aStringVal = OdfAnyURI.toString( _aHref );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "href" ), aStringVal );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "type" ), "simple" );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "actuate" ), "onRequest" );
    }

    /**
     * Get value of attribute "office:target-frame-name".
     */
    public OdfTargetFrameNameType getTargetFrameName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "target-frame-name" ) );
        return OdfTargetFrameNameType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:target-frame-name".
     */
    public void setTargetFrameName( OdfTargetFrameNameType _aTargetFrameName )
    {                    
        String aStringVal = OdfTargetFrameNameType.toString( _aTargetFrameName );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "target-frame-name" ), aStringVal );
    }

    /**
     * Get value of attribute "xlink:show".
     */
    public OdfShowType getShow()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.XLINK, "show" ) );
        return OdfShowType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "xlink:show".
     */
    public void setShow( OdfShowType _aShow )
    {                    
        String aStringVal = OdfShowType.toString( _aShow );
        setOdfAttribute( OdfName.get( OdfNamespace.XLINK, "show" ), aStringVal );
    }

    /**
     * Get value of attribute "office:name".
     */
    public String getName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "name" ) );
    }

    /**
     * Set value of attribute "office:name".
     */
    public void setName( String _aName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "name" ), _aName );
    }

    /**
     * Get value of attribute "office:title".
     */
    public String getTitle()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "title" ) );
    }

    /**
     * Set value of attribute "office:title".
     */
    public void setTitle( String _aTitle )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "title" ), _aTitle );
    }

    /**
     * Get value of attribute "office:server-map".
     */
    public Boolean getServerMap()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "server-map" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "office:server-map".
     */
    public void setServerMap( Boolean _aServerMap )
    {                    
        String aStringVal = OdfBoolean.toString( _aServerMap );
        setOdfAttribute( OdfName.get( OdfNamespace.OFFICE, "server-map" ), aStringVal );
    }

}
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

package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.type.OdfStyleName;


/**
 * ODF DOM Element implementation for element "<style:master-page>".
 */
public abstract class OdfMasterPageElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.STYLE, "master-page" );

    public OdfMasterPageElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME, OdfStyleFamily.DrawingPage, OdfName.get( OdfNamespace.DRAW, "style-name" ) );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }

    /**
     * Initialize mandatory attributes.
     */
    public void init(String _aName, String _aPageLayoutName)
    {
        setName( _aName );
        setPageLayoutName( _aPageLayoutName );
    }

    /**
     * Get value of attribute "style:name".
     */
    public String getName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:name".
     */
    public void setName( String _aName )
    {                    
        String aStringVal = OdfStyleName.toString( _aName );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "name" ), aStringVal );
    }

    /**
     * Get value of attribute "style:display-name".
     */
    public String getDisplayName()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "display-name" ) );
    }

    /**
     * Set value of attribute "style:display-name".
     */
    public void setDisplayName( String _aDisplayName )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "display-name" ), _aDisplayName );
    }

    /**
     * Get value of attribute "style:page-layout-name".
     */
    public String getPageLayoutName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "page-layout-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:page-layout-name".
     */
    public void setPageLayoutName( String _aPageLayoutName )
    {                    
        String aStringVal = OdfStyleName.toString( _aPageLayoutName );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "page-layout-name" ), aStringVal );
    }

    /**
     * Get value of attribute "draw:style-name".
     */
    public String getDrawStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "draw:style-name".
     */
    public void setDrawStyleName( String _aDrawStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aDrawStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.DRAW, "style-name" ), aStringVal );
    }

    /**
     * Get value of attribute "style:next-style-name".
     */
    public String getNextStyleName()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.STYLE, "next-style-name" ) );
        return OdfStyleName.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "style:next-style-name".
     */
    public void setNextStyleName( String _aNextStyleName )
    {                    
        String aStringVal = OdfStyleName.toString( _aNextStyleName );
        setOdfAttribute( OdfName.get( OdfNamespace.STYLE, "next-style-name" ), aStringVal );
    }

}
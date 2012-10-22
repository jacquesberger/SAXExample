/* Copyright 2011 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package org.jberger.saxexample;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class ZooContentHandler implements ContentHandler {

    private boolean inAnimal;

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (inAnimal){
            System.out.println(new String(ch, start, length));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (inAnimal) {
            inAnimal = false;
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (localName.equals("animal")) {
            this.inAnimal = true;
        }
    }

    @Override
    public void setDocumentLocator(Locator locator) {
        
    }

    @Override
    public void startDocument() throws SAXException {
        
    }

    @Override
    public void endDocument() throws SAXException {
        
    }

    @Override
    public void startPrefixMapping(String prefix, String uri) throws SAXException {
        
    }

    @Override
    public void endPrefixMapping(String prefix) throws SAXException {
        
    }

    @Override
    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
        
    }

    @Override
    public void processingInstruction(String target, String data) throws SAXException {
        
    }

    @Override
    public void skippedEntity(String name) throws SAXException {
        
    }

}

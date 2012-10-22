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

import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Main {

    public static void main(String[] args) throws SAXException, IOException {
        parseXmlDocument("xml/zoo.xml");
    }
    
    private static void parseXmlDocument(String filePath) throws SAXException, IOException {
        XMLReader parser = XMLReaderFactory.createXMLReader();
        ZooContentHandler handler = new ZooContentHandler();
        parser.setContentHandler(handler);
        parser.parse(filePath);
    }
}
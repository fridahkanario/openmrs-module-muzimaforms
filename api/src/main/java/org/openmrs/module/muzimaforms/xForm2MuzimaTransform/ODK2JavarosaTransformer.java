package org.openmrs.module.muzimaforms.xForm2MuzimaTransform;


import org.dom4j.DocumentException;
import org.openmrs.module.muzimaforms.api.impl.EnketoResult;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Stack;

public class ODK2JavarosaTransformer extends EnketoXslTransformer {

    public ODK2JavarosaTransformer(TransformerFactory transformerFactory, XslTransformPipeline transformPipeline) {
        super(transformerFactory, transformPipeline);
    }
}

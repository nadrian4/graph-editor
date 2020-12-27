package de.tesis.dynaware.grapheditor.core.emf.factory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import java.util.HashMap;

public class BoostedXMIResourceFactoryImpl extends XMIResourceFactoryImpl {

    @Override
    public Resource createResource(URI uri) {
        XMIResourceImpl result = new XMIResourceImpl(uri);
        result.getDefaultLoadOptions().put(XMIResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        result.setIntrinsicIDToEObjectMap(new HashMap());
        return result;
    }
}
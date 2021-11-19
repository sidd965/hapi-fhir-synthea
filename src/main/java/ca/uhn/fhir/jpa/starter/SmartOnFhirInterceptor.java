package ca.uhn.fhir.jpa.starter;

import org.hl7.fhir.r4.model.CapabilityStatement;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.UriType;
import org.hl7.fhir.instance.model.api.IBaseConformance;

import ca.uhn.fhir.interceptor.api.Hook;
import ca.uhn.fhir.interceptor.api.Interceptor;
import ca.uhn.fhir.interceptor.api.Pointcut;

@Interceptor
public class SmartOnFhirInterceptor {

    @Hook(Pointcut.SERVER_CAPABILITY_STATEMENT_GENERATED)
    public void customize(IBaseConformance capabilityStatement) {
        CapabilityStatement cs = (CapabilityStatement) capabilityStatement;
        cs.getSoftware().setName("Medblocks FHIR server");
        Extension smartOnFHIR = new Extension("http://fhir-registry.smarthealthit.org/StructureDefinition/oauth-uris");
        Extension token = new Extension("token");
        token.setValue(new UriType("https://example.com/token"));
        Extension authorize = new Extension("authorize");
        authorize.setValue(new UriType("https://example.com/authorize"));
        smartOnFHIR.addExtension(token);
        smartOnFHIR.addExtension(authorize);
        cs.getRest().get(0).getSecurity().addExtension(smartOnFHIR);
    }
}

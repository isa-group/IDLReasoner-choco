package idlreasonerchoco.analyzer;

import java.util.Map;

import org.apache.log4j.Logger;

import idlreasonerchoco.configuration.IDLConfiguration;
import idlreasonerchoco.configuration.model.IDLException;
import idlreasonerchoco.mapper.Mapper;
import idlreasonerchoco.resolutor.Resolutor;

public class Analyzer {

	private static final Logger LOG = Logger.getLogger(Analyzer.class);
	
	private final Mapper mapper;
	private final Resolutor resolutor;
	private final IDLConfiguration configuration;
	
	private boolean lastRandomReqWasValid;
	private boolean needReloadConstraintsFile;
	
	public Analyzer(String specificationType, String apiSpecification, String operationPath, String operationType) throws IDLException {
		this(specificationType, apiSpecification, operationPath, operationType, true, null);
	}
	
	public Analyzer(String specificationType, String apiSpecification, String operationPath, String operationType, boolean chargeFromFile, String idlProperties) throws IDLException {
		this.configuration = new IDLConfiguration(specificationType, apiSpecification, operationPath, operationType, chargeFromFile, idlProperties);
		this.needReloadConstraintsFile = true;
		this.lastRandomReqWasValid = false;
		this.resolutor = new Resolutor(configuration);
		this.mapper = new Mapper(configuration);
	}
	
	public Boolean isValidRequest() {
		return null;
	}
	
	public Boolean isConsistent() {
		return null;
	}
	
	public Boolean isDeadParameter() {
		return null;
	}
	
	public Boolean isFalseOptional() {
		return null;
	}
	
	public Boolean isValidIDL() {
		return null;
	}
	
	public Map<String, String> getRandomRequest() {
		return null;
	}
	
}

package at.o2xfs.xfs.spi.api;

import java.util.ServiceLoader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class ServiceProviderFactory {

	private static final Logger LOG = LogManager.getLogger(ServiceProviderFactory.class);

	public abstract ServiceProvider newServiceProvider();

	public static final ServiceProviderFactory getFactory() {
		ServiceProviderFactory result = null;
		for (ServiceProviderFactory each : ServiceLoader.load(ServiceProviderFactory.class)) {
			LOG.debug("{}", each);
			result = each;
		}
		return result;
	}
}

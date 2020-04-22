package at.o2xfs.xfs.spi.api;

import at.o2xfs.memory.core.Address;
import at.o2xfs.memory.core.MemorySystem;
import at.o2xfs.xfs.api.XfsException;

public interface SpiMemorySystem extends MemorySystem {

	Address allocateBuffer(Object value) throws XfsException;

	Address allocateMore(Address original, Object value) throws XfsException;

	void write(Address address, Object value);

}

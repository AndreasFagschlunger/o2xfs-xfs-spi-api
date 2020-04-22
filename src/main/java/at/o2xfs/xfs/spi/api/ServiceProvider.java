package at.o2xfs.xfs.spi.api;

public interface ServiceProvider {

	int cancelAsyncRequest(int hService, long requestId);

	int close(int hService, byte[] hWnd, long requestId);

	int deregister(int hService, long dwEventClass, byte[] hWndReg, byte[] hWnd, long requestId);

	int execute(int hService, long dwCommand, byte[] lpCmdData, long dwTimeOut, byte[] hWnd, long requestId);

	int getInfo(int hService, long dwCategory, byte[] lpQueryDetails, long dwTimeOut, byte[] hWnd, long requestId);

	int lock(int hService, long dwTimeOut, byte[] hWnd, long requestId);

	int open(int hService, String logicalName, byte[] hApp, String appId, long dwTraceLevel, long dwTimeOut,
			byte[] hWnd, long requestId, byte[] hProvider, long dwSPIVersionsRequired, byte[] lpSPIVersion,
			long dwSrvcVersionsRequired, byte[] lpSrvcVersion);

	int register(int hService, long dwEventClass, byte[] hWndReg, byte[] hWnd, long requestId);

	int setTraceLevel(int hService, long dwTraceLevel);

	int unloadService();

	int unlock(int hService, byte[] hWnd, long requestId);

}

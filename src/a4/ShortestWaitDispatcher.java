package a4;

import java.util.*;

/*
 * ShortestWaitDispatcher
 * An implementation of Dispatcher that chooses the first driver that is closest to the client's
 * position (i.e., will incur the shortest wait time)
 */

public class ShortestWaitDispatcher implements Dispatcher {

	public ShortestWaitDispatcher() {}
	
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		Arrays.sort(availableDrivers, Comparator.comparing((d) ->  d.distanceTo(request)));
		return availableDrivers[0];
	}

}
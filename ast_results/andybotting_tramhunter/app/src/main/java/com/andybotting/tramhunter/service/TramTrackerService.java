// isComment
package com.andybotting.tramhunter.service;

import com.andybotting.tramhunter.objects.NextTram;
import com.andybotting.tramhunter.objects.Route;
import com.andybotting.tramhunter.objects.Stop;
import com.andybotting.tramhunter.objects.TramRun;
import java.util.List;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    Stop isMethod(int isParameter) throws TramTrackerServiceException;

    List<NextTram> isMethod(Stop isParameter, Route isParameter) throws TramTrackerServiceException;

    TramRun isMethod(int isParameter) throws TramTrackerServiceException;

    String isMethod() throws TramTrackerServiceException;
}

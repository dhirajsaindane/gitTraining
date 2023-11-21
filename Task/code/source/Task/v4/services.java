package Task.v4;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class services

{
	// ---( internal utility methods )---

	final static services _instance = new services();

	static services _newInstance() { return new services(); }

	static services _cast(Object o) { return (services)o; }

	// ---( server methods )---




	public static final void java (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(java)>> ---
		// @sigtype java 3.5
		// [i] field:0:required input
		// [o] field:0:required result
		   IDataCursor pipelineCursor = pipeline.getCursor();
		    int inputNumber = Integer.parseInt(IDataUtil.getString(pipelineCursor, "input"));
		    pipelineCursor.destroy();
		    
		    // Perform even number check
		    boolean isEven = isEven(inputNumber);
		    
		    // Prepare output pipeline
		    IData output = IDataFactory.create();
		    IDataCursor outputCursor = output.getCursor();
		    IDataUtil.put(outputCursor, "input", String.valueOf(inputNumber));
		    IDataUtil.put(outputCursor, "isEven", String.valueOf(isEven));
		    outputCursor.destroy();
		    
		    // Put the output pipeline back to the pipeline
		    pipelineCursor = pipeline.getCursor();
		    IDataUtil.put(pipelineCursor, "output", output);
		    pipelineCursor.destroy();
		}
		
		// Even number checking function
		public static boolean isEven(int number) {
		    return number % 2 == 0;
			
		// --- <<IS-END>> ---

                
	}
}


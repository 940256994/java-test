package org.ran.test.junit.launcher;
import static org.junit.platform.engine.discovery.ClassNameFilter.includeClassNamePatterns;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

import java.io.PrintWriter;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.ran.test.junit.AssertionsTest;
public class Mylauncher {
	public static void main(String[] args) {
		LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
			    .selectors(
			    	selectClass(AssertionsTest.class)
			    )
			    .filters(
			        includeClassNamePatterns(".*Test")
			    )
			    .build();

			Launcher launcher = LauncherFactory.create();

			//TestPlan testPlan = launcher.discover(request);
			
			SummaryGeneratingListener listener = new SummaryGeneratingListener();
			launcher.registerTestExecutionListeners(listener);

			launcher.execute(request);

			TestExecutionSummary summary = listener.getSummary();
			
			summary.printTo(new PrintWriter(System.out));
	}
}

package org.jenkins.tools.test.hook;

import org.jenkins.tools.test.model.PomData;
import org.jenkins.tools.test.model.hook.PluginCompatTesterHookBeforeExecution;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Workaround for Warnings NG plugin since it needs execute integration tests.
 */
public class WarningsNGHook extends PluginWithIntegrationTestsHook {

    @Override
    public boolean check(Map<String, Object> info) {
        PomData data = (PomData) info.get("pomData");
        return "warnings-ng".equals(data.artifactId);
    }

    @Override
    public Map<String, Object> action(Map<String, Object> info) throws Exception {

    }


}

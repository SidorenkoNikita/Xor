package com;

import org.kohsuke.args4j.CmdLineException;

/**
 * Created by kaval on 23.04.2017.
 */
public class Main {
        public static void main(String[] args) throws CmdLineException {
            Launcher check = new Launcher();
            check.cml(args);
            WorkWithFiles code = new WorkWithFiles(check.getKey());
            code.fayels(check.getInput(), check.getOutput());
    }
}

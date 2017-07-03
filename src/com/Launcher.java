package com;
/**
 * Created by kaval on 11.04.2017.
 */
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Launcher {

    @Option(required = true ,name="-c",aliases = "-d" , usage="Shifraci9",metaVar = "key")
    private String key;
    @Option(name="-o",usage="output to this file",metaVar = "output")
    private String output;
    @Option(required = true ,name="-i",usage="input to this file",metaVar = "input")
    private String input;

    public void cml(String[] args) throws CmdLineException {
        CmdLineParser parser = new CmdLineParser(this);
        try {
            parser.parseArgument(args);
            if (!(new File(input).exists())) {
                throw new IllegalArgumentException();
            }
            if (!checkKey(key)) throw new NumberFormatException("incorrect key");
        } catch (CmdLineException e) {
            throw e;
        }

    }
    public boolean checkKey(String keys){
        Pattern p = Pattern.compile("(^[#0-9\\\\A-F\\\\]+$)");
        Matcher m = p.matcher(keys);
        return m.matches();
    }



    public String getKey() {
        return this.key;
    }

    public String getInput() {
        return this.input;
    }

    public String getOutput() {
        return this.output;
    }


}
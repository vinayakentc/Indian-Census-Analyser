package com.censusanalyser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StateCodeAnalyserTest {
    private static final String STATECODE_CSV_FILE = "C:\\Users\\Raj\\Desktop\\Java\\census analyser\\StateCode.csv";
    private static final String INCORRECT_FILE = "C:\\Users\\Raj\\Desktop\\Java\\census analyser\\data.txt";
    private static final String TYPE_INCORRECT_FILE = "D:\\Target 2 (CapGemini)\\BridgeLabz Training\\DataBL\\StateCode.txt";
    private static final String DELIMITER_INCORRECT_FILE = "C:\\Users\\Raj\\Desktop\\Java\\census analyser\\StateCodeWrongDelimiter.csv";
    private static final String HEADER_INCORRECT_FILE = "C:\\Users\\Raj\\Desktop\\Java\\census analyser\\StateCodeWrongHeader.csv";
    StateCensusAnalyser sca;

    @Before
    public void initialize(){
        sca = new StateCensusAnalyser();
    }

    @Test
    public void checkNumberofRecords() throws StateCensusAnalyserException {
        Assert.assertEquals(37, sca.loadDataFromCSV(STATECODE_CSV_FILE));
    }

    @Test
    public void checkIncorrectFile() throws StateCensusAnalyserException {
        try{
            sca.loadDataFromCSV(INCORRECT_FILE);
        }catch (StateCensusAnalyserException e){
            Assert.assertEquals("Incorrect File", e.getMessage());
        }
    }

    @Test
    public void checkTypeIncorrectFile() throws StateCensusAnalyserException {
        try{
            sca.loadDataFromCSV(TYPE_INCORRECT_FILE);
        }catch (StateCensusAnalyserException e){
            Assert.assertEquals("Incorrect File", e.getMessage());
        }
    }

    @Test
    public void checkCorrectFileIncorrectDelimiter() throws StateCensusAnalyserException{
        try{
            sca.loadDataFromCSV(DELIMITER_INCORRECT_FILE);
        }catch (StateCensusAnalyserException e){
            Assert.assertEquals("Incorrect File", e.getMessage());
        }
    }

    @Test
    public void checkCorrectFileIncorrectHeader() throws StateCensusAnalyserException{
        try{
            sca.loadDataFromCSV(HEADER_INCORRECT_FILE);
        }catch (StateCensusAnalyserException e){
            Assert.assertEquals("Incorrect File", e.getMessage());
        }
    }
}
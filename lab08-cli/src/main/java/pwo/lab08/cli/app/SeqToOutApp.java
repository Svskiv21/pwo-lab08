package pwo.lab08.cli.app;

import pwo.lab08.engine.utils.SequenceTools;

/**
 *
 * @author NK
 */

public class SeqToOutApp extends SeqToFileApp {

    @Override
    protected boolean getArgs(String[] args) {
        if (super.getArgs(args)) return true;
        return seqType != null && from >= 0 && to >= 0;
    }

    @Override
    protected boolean writeSeqq() {
        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));
        return true;
    }


    @Override
    public void run(String[] args) {
        System.out.println("Sequence to terminal CLI app");
        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to");
            return;
        }
        writeSeqq();
    }
}
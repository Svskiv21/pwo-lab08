package pwo.lab08.cli.app;

/**
 *
 * @author NK
 */
public class Sequence {

    public static void main(String[] args) {
        switch (args.length) {
            case 3 -> (new SeqToOutApp()).run(args);
            case 4 -> (new SeqToFileApp()).run(args);
            default -> System.out.println("!Illegal arguments\n"
                    + "Legal usage: seqName from to [fileName]");
        }
    }
}
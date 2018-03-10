package com.logmein.qna.task2;

/**
 * Created by bbanyai on 3/9/18.
 */
public class Composition {

    interface Logger {
        void error(String message);
        void info(String message);
        void verbose(String message);
    }

    class SoutLogger implements Logger {

        @Override
        public void error(String message) {
            System.err.println(message);
        }

        @Override
        public void info(String message) {
            System.out.println(message);
        }

        @Override
        public void verbose(String message) {
            System.out.println(message);
        }
    }

    class PrefixedLoggerWithInheritance extends SoutLogger {

        @Override
        public void error(String message) {
            super.error("HELLO: "+message);
        }

        @Override
        public void info(String message) {
            super.info("HELLO: "+message);
        }

        @Override
        public void verbose(String message) {
            super.verbose("HELLO: "+message);
        }
    }

    class PrefixedLogger implements Logger {

        @Override
        public void error(String message) {
            target.error("HELLO: "+message);
        }

        @Override
        public void info(String message) {
            target.info("HELLO: "+message);
        }

        @Override
        public void verbose(String message) {
            target.verbose("HELLO: "+message);
        }

        final Logger target;

        PrefixedLogger(Logger target) {
            this.target = target;
        }
    }

    public void main(String[] args) {

        Logger sout = new PrefixedLogger(new SoutLogger());

    }



}

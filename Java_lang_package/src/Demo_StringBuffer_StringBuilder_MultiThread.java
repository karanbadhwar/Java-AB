public class Demo_StringBuffer_StringBuilder_MultiThread {
    public static void main(String[] args) {


        // Creating multiple threads that modify the shared StringBuffer
        for (int i = 0; i < 5; i++) {
            StringBuffer sharedBuffer = new StringBuffer();
            Thread thread = new Thread(new StringModifier(sharedBuffer));
            thread.start();
        }
    }

    // Runnable class to append thread ID to the shared StringBuffer
    static class StringModifier implements Runnable {
        private final StringBuffer sharedBuffer;

        StringModifier(StringBuffer sharedBuffer) {
            this.sharedBuffer = sharedBuffer;
        }

        @Override
        public void run() {
            // Appending thread ID to the shared StringBuffer
            synchronized (sharedBuffer) {
                sharedBuffer.append("Thread ID: ").append(Thread.currentThread().getId()).append("\n");
                System.out.println(sharedBuffer.toString());
            }
        }
    }
}


//public class Demo {
//    public static void main(String[] args) {
//
//
//        // Creating multiple threads that modify the shared StringBuilder
//        for (int i = 0; i < 5; i++) {
//            StringBuilder sharedBuilder = new StringBuilder();
//            Thread thread = new Thread(new StringModifier(sharedBuilder));
//
//
//            thread.start();
//        }
//    }
//
//    // Runnable class to append thread ID to the shared StringBuilder
//    static class StringModifier implements Runnable {
//        private final StringBuilder sharedBuilder;
//
//        StringModifier(StringBuilder sharedBuilder) {
//            this.sharedBuilder = sharedBuilder;
//        }
//
//        @Override
//        public void run() {
//            // Appending thread ID to the shared StringBuilder
//            sharedBuilder.append("Thread ID: ").append(Thread.currentThread().getId()).append("\n");
//
//            System.out.println(sharedBuilder.toString());
//        }
//    }
//}

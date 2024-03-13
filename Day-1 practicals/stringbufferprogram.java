public class stringbufferprogram {
        public static void main(String[] args) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Hello");
            stringBuilder.append(" ");
            stringBuilder.append("World");
            System.out.println("StringBuilder result: " + stringBuilder.toString());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Hello");
            stringBuffer.append(" ");
            stringBuffer.append("World");
            System.out.println("StringBuffer result: " + stringBuffer.toString());
            int iterations = 1000000;
            long startTimeStringBuilder = System.currentTimeMillis();
            StringBuilder stringBuilderPerformance = new StringBuilder();
            for (int i = 0; i < iterations; i++) {
                stringBuilderPerformance.append("Hello");
                stringBuilderPerformance.append(" ");
                stringBuilderPerformance.append("World");
            }
            long endTimeStringBuilder = System.currentTimeMillis();
            long elapsedTimeStringBuilder = endTimeStringBuilder - startTimeStringBuilder;
            System.out.println("\nTime taken by StringBuilder: " + elapsedTimeStringBuilder + " milliseconds");
            long startTimeStringBuffer = System.currentTimeMillis();
            StringBuffer stringBufferPerformance = new StringBuffer();
            for (int i = 0; i < iterations; i++) {
                stringBufferPerformance.append("Hello");
                stringBufferPerformance.append(" ");
                stringBufferPerformance.append("World");
            }
            long endTimeStringBuffer = System.currentTimeMillis();
            long elapsedTimeStringBuffer = endTimeStringBuffer - startTimeStringBuffer;
            System.out.println("Time taken by StringBuffer: " + elapsedTimeStringBuffer + " milliseconds");
        }
    }

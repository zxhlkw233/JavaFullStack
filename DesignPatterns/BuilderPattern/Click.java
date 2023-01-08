package DesignPatterns.BuilderPattern;

// 省略 getter 和 setter 方法
public class Click {
    public static void main(String[] args) {
        // 非 Builder 模式 
        Computer computer = new Computer("cpu", "screen", "memory", "mainboard");
        // Builder 模式 
        NewComputer newComputer = new NewComputer.Builder()
                .computer(computer)
                .cpu("cpu")
                .screen("screen")
                .memory("memory")
                .mainboard("mainboard")
                .build();
    }
}
class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;
    public Computer(String cpu, String screen, String memory, String mainboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainboard = mainboard;
    }
}
class NewComputer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;
    public NewComputer() {
        throw new RuntimeException("can’t init");
    }
    private NewComputer(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }
    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;
        private Computer computer;
        public Builder() {}

        public Builder computer(Computer computer) {
            computer = computer;
            return this;
        }

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }
        public Builder screen(String val) {
            screen = val;
            return this;
        }
        public Builder memory(String val) {
            memory = val;
            return this;
        }
        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }
        public NewComputer build() {
            return new  NewComputer(this);}
    }
}
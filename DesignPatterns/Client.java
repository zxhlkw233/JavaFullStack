package DesignPatterns;


// 目标接口：定义了英文播报器的接口
 interface EnglishReporter {
    void report(String news);
}

// 被适配者：定义了中文播报器的接口
 interface ChineseReporter {
    void reportInChinese(String news);
}
class ChineseReporterImpl implements ChineseReporter {
    @Override
    public void reportInChinese(String news) {
        System.out.println(news);
    }
}

// 适配器：将中文播报器适配成英文播报器
 class ChineseReporterAdapter implements EnglishReporter {
    private ChineseReporter chineseReporter;

    public ChineseReporterAdapter(ChineseReporter chineseReporter) {
        this.chineseReporter = chineseReporter;
    }

    @Override
    public void report(String news) {
        String translatedNews = translate(news);
        chineseReporter.reportInChinese(translatedNews);
    }

    // 翻译新闻
    private String translate(String news) {
        // 实现翻译逻辑，此处简化为直接返回原文
        return news;
    }
}

// 客户端代码
public class Client {
    public static void main(String[] args) {
        // 创建中文播报器
        ChineseReporter chineseReporter = new ChineseReporterImpl();
        // 创建适配器，将中文播报器适配成英文播报器
        EnglishReporter englishReporter = new ChineseReporterAdapter(chineseReporter);

        // 使用英文播报器播报新闻
        englishReporter.report("Breaking News!");
    }
}

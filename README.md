# Java 学習プロジェクト

Eclipseから学習をスタートし、現在は **VS Code (WSL/Ubuntu)** に環境を移行して学習しています。

## 現在の環境
- **OS**: Windows (WSL2 / Ubuntu)
- **Editor**: Visual Studio Code
- **Structure**: プロ仕様の `src/bin` 分離構成

## フォルダ構成のルール
Javaの命名規則に従い、以下の構造で管理しています。
- `src/java_study/`: ソースコード（パッケージ名 `java_study`）
- `bin/`: コンパイル済みクラスファイル（Git除外対象）

## 実行コマンド（備忘録）
ターミナル（プロジェクトルート）で以下を実行する：
```bash
javac -d bin src/java_study/ファイル名.java && java -cp bin java_study.ファイル名
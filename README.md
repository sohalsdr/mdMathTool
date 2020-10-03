![](https://github.com/sohalsdr/mdMathTool/raw/master/mdMathToolBanner.jpg)
![](https://img.shields.io/github/license/sohalsdr/mdMathTool?style=flat-square) ![](https://img.shields.io/tokei/lines/github/sohalsdr/mdMathTool?style=flat-square) ![](https://img.shields.io/github/downloads/sohalsdr/mdMathTool/total?style=flat-square) ![](https://img.shields.io/github/v/release/sohalsdr/mdMathTool?style=flat-square)

This is a tool to help work with inline math in markdown. Math can be frustrating in markdown, with some parsers using \$ as a delimiter, some using \$\$ as a delimiter, others using a different delimiter, and then GitHub, which doesn't support inline math at all.

## What can it do?

- Translate inline LaTeX math into embedded images for use with Github

- > $lim_{x\to 2}f(x)$ -> <img src="https://render.githubusercontent.com/render/math?math=%24lim_%7Bx%5Cto%202%7Df(x)%24">

- Convert math delimiters from one to another

- > $lim_{x\to 2}f(x)$ -> $$lim_{x\to 2}f(x)$$

## What can't it do?

- Currently cannot do LaTeX style delimiters (e. g. "\\[x^2\\]")
- Currently does not employ any heuristics, [Pandoc](https://github.com/jgm/pandoc) style heuristics for dollar-sign delimiters is planned
- Does not parse the markdown, only performs basic string substitution

## Usage
**Note:** Currently incompatible with Windows

To use mdMathTool, start by downloading the latest release, and opening a terminal in the same folder as the .jar file.

mdMathTool has three modes: Simple Mode, Advanced Mode, and Batch Mode:

Simple Mode prompts the user for all values, and can be run with:

```
$ java -jar mdMathTool-1.0.0.jar -s
```

Advanced Mode takes all arguments when the command is run, and can be run as follows:

```
$ java -jar mdMathTool-1.0.0.jar -a <source filepath> <destination filepath> <source delimiter> <destination delimiter>
```

Batch Mode is similar to Advanced Mode, but processes whole folders:

```
$ java -jar mdMathTool-1.0.0.jar -b <source folder> <append to filename> <source delimiter> <destination delimiter>
```

**Notes:**

- Source and destination delimiters must be surrounded by ' ' (e. g. '\$')
- Source filepath and destination file path cannot be the same file
- mdMathTool will create the destination filepath specified if it does not already exist
- The append to file name argument appends the specified string directly after the filename, before the extension. It cannot be left empty.








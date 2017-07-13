#!/bin/sh

OUTDIR=clientDataExt
rm -r $OUTDIR; mkdir $OUTDIR
java -jar swagger-codegen-cli.jar generate \
	-i swaggerDataExt.yaml \
	-l java \
	-o $OUTDIR \
	-c ./configDataExt.json

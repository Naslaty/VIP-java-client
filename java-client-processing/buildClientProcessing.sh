#!/bin/sh

OUTDIR=client
rm -r $OUTDIR; mkdir $OUTDIR
java -jar swagger-codegen-cli.jar generate \
	-i swaggerProcessing.yaml \
	-l java \
	-o $OUTDIR \
	-c ./configProcessing.json

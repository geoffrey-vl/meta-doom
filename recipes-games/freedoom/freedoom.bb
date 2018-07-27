SECTION = "games"
DESCRIPTION = "The Freedoom project aims at collaboratively creating a Free IWAD file.\
	       Combined with the Free source code, this results in a complete game \
	       based on the Doom engine which is Free Software."
HOMEPAGE = "http://freedoom.sourceforge.net/"
PRIORITY = "optional"
LICENSE = "GPL"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=f4bc057015de5afef5e56f1cd5dfbae1"
do_unpack[depends] += "unzip-native:do_populate_sysroot"

PV = "0.11.3"

SRC_URI = "https://github.com/freedoom/freedoom/releases/download/v${PV}/freedoom-${PV}.zip"


PACKAGE_ARCH = "all"
FILES_${PN} = "${datadir}/games/doom/*"
FILES_${PN}-doc = "${datadir}/doc/freedoom/*"

do_install() {
	install -d ${D}/${datadir}/games/doom

	install -m 0644 ${WORKDIR}/freedoom-${PV}/freedoom1.wad ${D}/${datadir}/games/doom/
	install -m 0644 ${WORKDIR}/freedoom-${PV}/freedoom2.wad ${D}/${datadir}/games/doom/
}


SRC_URI[md5sum] = "55e9a2c7a24651d63654407d2cec26c2"
SRC_URI[sha256sum] = "28a5eafbb1285b78937bd408fcdd8f25f915432340eee79da692eae83bce5e8a"

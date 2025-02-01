## [1.2.3](https://github.com/position-pal/user-service/compare/1.2.2...1.2.3) (2025-02-01)

### Dependency updates

* **deps:** update eclipse-temurin:21 docker digest to 5aa48ef ([#156](https://github.com/position-pal/user-service/issues/156)) ([879072f](https://github.com/position-pal/user-service/commit/879072f9a1d480e281783c5309153ce1d941a2b4))
* **deps:** update plugin com.gradle.develocity to v3.19.1 ([#157](https://github.com/position-pal/user-service/issues/157)) ([aa6de8d](https://github.com/position-pal/user-service/commit/aa6de8de7cfe3aae6aec94352db8fd09a8889240))
* **deps:** update plugin git-semantic-versioning to v3.1.10 ([535ee81](https://github.com/position-pal/user-service/commit/535ee812808a94dadc25773dabe6b2eddd4cd481))
* **deps:** update plugin git-semantic-versioning to v4 ([#159](https://github.com/position-pal/user-service/issues/159)) ([a9f74a0](https://github.com/position-pal/user-service/commit/a9f74a0d27a76dfead894a6935166370105d85e8))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.20 ([e93be89](https://github.com/position-pal/user-service/commit/e93be89d59b0e029718fd4585aa1a17c9f357043))
* **deps:** update rabbitmq:4-management docker digest to f100517 ([#153](https://github.com/position-pal/user-service/issues/153)) ([40ca575](https://github.com/position-pal/user-service/commit/40ca575ed9311c0e41a14210d05a3ce817a47b9a))

### Bug Fixes

* userdata ([#161](https://github.com/position-pal/user-service/issues/161)) ([61e3b98](https://github.com/position-pal/user-service/commit/61e3b9886539371c397ad32d405e54381147c6a1))

### Build and continuous integration

* **deps:** update actions/setup-java digest to 3a4f6e1 ([#154](https://github.com/position-pal/user-service/issues/154)) ([372f777](https://github.com/position-pal/user-service/commit/372f777e893e1405c26107ba4df8a8fb562d1a06))

## [1.2.2](https://github.com/position-pal/user-service/compare/1.2.1...1.2.2) (2025-01-28)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v2.1.10 ([#150](https://github.com/position-pal/user-service/issues/150)) ([5f143f6](https://github.com/position-pal/user-service/commit/5f143f633078c7dcf7721339ffc11616f31ab0f7))

### Build and continuous integration

* deploy api using correct folder ([0cc3e9e](https://github.com/position-pal/user-service/commit/0cc3e9ee8d741d0a84dc7525fd1ac9ee25034486))
* **deps:** update actions/setup-node action to v4.2.0 ([#149](https://github.com/position-pal/user-service/issues/149)) ([cbdc0bd](https://github.com/position-pal/user-service/commit/cbdc0bd77cd796c4e5f07cc0a683e5f69097055f))

## [1.2.1](https://github.com/position-pal/user-service/compare/1.2.0...1.2.1) (2025-01-24)

### Dependency updates

* **deps:** update eclipse-temurin:21 docker digest to d59ca49 ([#144](https://github.com/position-pal/user-service/issues/144)) ([84cb1d9](https://github.com/position-pal/user-service/commit/84cb1d9e1c41f52f3998d39e12f09e1bd6d5d38a))
* **deps:** update grpc-java monorepo to v1.70.0 ([#145](https://github.com/position-pal/user-service/issues/145)) ([6b9cda3](https://github.com/position-pal/user-service/commit/6b9cda31494bb61cb436f55051ed207471780258))

### Bug Fixes

* **rabbitmq:** use durable exchanges and remove un-necessary group_updates queue ([#148](https://github.com/position-pal/user-service/issues/148)) ([b833ceb](https://github.com/position-pal/user-service/commit/b833ceb76dd15cecc5c3529c11ba79d23183688a))

### Build and continuous integration

* **deps:** update dawidd6/action-download-artifact action to v8 ([#146](https://github.com/position-pal/user-service/issues/146)) ([04cf90a](https://github.com/position-pal/user-service/commit/04cf90a133aeee215a1a2160935dd9700adf185c))
* **deps:** update docker/build-push-action digest to ca877d9 ([#147](https://github.com/position-pal/user-service/issues/147)) ([c224936](https://github.com/position-pal/user-service/commit/c22493669c5fcc920bbd8dd892ce2e262d903897))

## [1.2.0](https://github.com/position-pal/user-service/compare/1.1.2...1.2.0) (2025-01-20)

### Features

* update ci to support multi platform docker images  ([#143](https://github.com/position-pal/user-service/issues/143)) ([0895cdc](https://github.com/position-pal/user-service/commit/0895cdc1c3438ed6f4d742a3fd41d5d31b1e3349))

### Dependency updates

* **deps:** update dependency org.postgresql:postgresql to v42.7.5 ([#140](https://github.com/position-pal/user-service/issues/140)) ([cac4bf8](https://github.com/position-pal/user-service/commit/cac4bf8171734c5270dc0f881dae932d302f519e))
* **deps:** update grpc-java monorepo to v1.69.1 ([#141](https://github.com/position-pal/user-service/issues/141)) ([6665c69](https://github.com/position-pal/user-service/commit/6665c69ce2142bcfbfa795fc178843521e0dec89))

## [1.1.2](https://github.com/position-pal/user-service/compare/1.1.1...1.1.2) (2025-01-15)

### Bug Fixes

* grpc user password and hashing ([#139](https://github.com/position-pal/user-service/issues/139)) ([e23412e](https://github.com/position-pal/user-service/commit/e23412ebd21416a9b4d8dde4f3711925da00a8ad))

### Build and continuous integration

* **deps:** update docker/build-push-action digest to 67a2d40 ([#138](https://github.com/position-pal/user-service/issues/138)) ([a197b86](https://github.com/position-pal/user-service/commit/a197b86854f9b1d65becfb5029a8c692b165ca68))

## [1.1.1](https://github.com/position-pal/user-service/compare/1.1.0...1.1.1) (2025-01-12)

### Dependency updates

* **deps:** update dependency io.mockk:mockk to v1.13.16 ([#135](https://github.com/position-pal/user-service/issues/135)) ([aa006a8](https://github.com/position-pal/user-service/commit/aa006a8bdee6018ce67220aa61b0714c3db399d3))
* **deps:** update dependency org.mockito:mockito-core to v5.15.2 ([#126](https://github.com/position-pal/user-service/issues/126)) ([fadee7f](https://github.com/position-pal/user-service/commit/fadee7ff14f0cf106bfdb9175b3be57c69784e9b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.118 ([#132](https://github.com/position-pal/user-service/issues/132)) ([2e89764](https://github.com/position-pal/user-service/commit/2e89764a3db79117f5e38f2507bd17b73453d6e9))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.119 ([#136](https://github.com/position-pal/user-service/issues/136)) ([f9db90b](https://github.com/position-pal/user-service/commit/f9db90bf28af8855f1d89f582cdc89c732e937dd))
* **deps:** update gradle:8-jdk17 docker digest to e212939 ([#125](https://github.com/position-pal/user-service/issues/125)) ([711cacd](https://github.com/position-pal/user-service/commit/711cacd8b077ab08fa9b79ba0cb444586036ddfd))
* **deps:** update node.js to 22.13 ([#131](https://github.com/position-pal/user-service/issues/131)) ([725dd47](https://github.com/position-pal/user-service/commit/725dd47c7a94eef1de46199973d5bf805becd77a))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.18 ([#123](https://github.com/position-pal/user-service/issues/123)) ([312ad9a](https://github.com/position-pal/user-service/commit/312ad9a8757943895344e99645fbd796fdc1384f))
* **deps:** update postgres:17.2-alpine docker digest to 0bcc5bb ([#134](https://github.com/position-pal/user-service/issues/134)) ([0bc4df6](https://github.com/position-pal/user-service/commit/0bc4df6f9217cd24a73c2b40c8a4437d446455f8))
* **deps:** update postgres:17.2-alpine docker digest to 17143ad ([#130](https://github.com/position-pal/user-service/issues/130)) ([642ee38](https://github.com/position-pal/user-service/commit/642ee38a0ad1b551b85824d188c842bbad1d04fc))
* **deps:** update postgres:17.2-alpine docker digest to 272a3f9 ([#127](https://github.com/position-pal/user-service/issues/127)) ([1c0d77c](https://github.com/position-pal/user-service/commit/1c0d77c68dea305ee37fa29f3ff176f9ab8d8564))
* **deps:** update proto to v4.29.3 ([#133](https://github.com/position-pal/user-service/issues/133)) ([607643a](https://github.com/position-pal/user-service/commit/607643aa118ddbeb4cf62584300821a07e88c59e))

### Bug Fixes

* added status code in response and handled keyword bearer ([#137](https://github.com/position-pal/user-service/issues/137)) ([e0cdb26](https://github.com/position-pal/user-service/commit/e0cdb26772703aa56245aca66638873fb2a7a74d))

### Build and continuous integration

* **deps:** update docker/build-push-action digest to b32b51a ([#128](https://github.com/position-pal/user-service/issues/128)) ([604e622](https://github.com/position-pal/user-service/commit/604e62295469a402c21d4d0d3c6fbb0e3f2dce06))
* **deps:** update docker/setup-qemu-action digest to 53851d1 ([#129](https://github.com/position-pal/user-service/issues/129)) ([c6b7068](https://github.com/position-pal/user-service/commit/c6b7068f132c46ae51651a17c62affa14de812aa))

## [1.1.0](https://github.com/position-pal/user-service/compare/1.0.2...1.1.0) (2024-12-23)

### Features

* **docker:** support for the service container image. ([#124](https://github.com/position-pal/user-service/issues/124)) ([04e9aae](https://github.com/position-pal/user-service/commit/04e9aae5ff803723f777dddbd7f6fb6c2e70ad8f))

### Dependency updates

* **deps:** update dependency com.rabbitmq:amqp-client to v5.24.0 ([#113](https://github.com/position-pal/user-service/issues/113)) ([2b157a2](https://github.com/position-pal/user-service/commit/2b157a2c147c3666c1b958f173611ee1af7e5f3d))
* **deps:** update dependency io.github.cdimascio:dotenv-kotlin to v6.5.0 ([#115](https://github.com/position-pal/user-service/issues/115)) ([c272694](https://github.com/position-pal/user-service/commit/c272694d2ac5d84098d91fd3154121bbe70a63ac))
* **deps:** update dependency io.mockk:mockk to v1.13.14 ([#121](https://github.com/position-pal/user-service/issues/121)) ([f49db3b](https://github.com/position-pal/user-service/commit/f49db3b15678d3047f994f4ed52dce97302d2d11))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.116 ([#107](https://github.com/position-pal/user-service/issues/107)) ([d100155](https://github.com/position-pal/user-service/commit/d1001550540da8cb39a5037ec757174c5ed76256))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.117 ([#122](https://github.com/position-pal/user-service/issues/122)) ([108ba43](https://github.com/position-pal/user-service/commit/108ba43efcbc6f40fcef888a21bce2655ff67201))
* **deps:** update grpc-java monorepo to v1.68.2 ([#99](https://github.com/position-pal/user-service/issues/99)) ([f1a2c3a](https://github.com/position-pal/user-service/commit/f1a2c3a4ea8830b100a445f37ff169a9513ecbcd))
* **deps:** update grpc-java monorepo to v1.69.0 ([#109](https://github.com/position-pal/user-service/issues/109)) ([9d5907a](https://github.com/position-pal/user-service/commit/9d5907a202fa5ea8d9f095b903f394d3dd4bbc20))
* **deps:** update ktor monorepo to v3.0.2 ([#102](https://github.com/position-pal/user-service/issues/102)) ([03183ca](https://github.com/position-pal/user-service/commit/03183ca031f4e21f7acad0942d342e7a3bfdad01))
* **deps:** update ktor monorepo to v3.0.3 ([#119](https://github.com/position-pal/user-service/issues/119)) ([e86fe76](https://github.com/position-pal/user-service/commit/e86fe76aa1d19957237cf84ce9801758048f551c))
* **deps:** update node.js to 22.12 ([#103](https://github.com/position-pal/user-service/issues/103)) ([609514b](https://github.com/position-pal/user-service/commit/609514b7b8c31fe2d75469547c444393dbec6912))
* **deps:** update plugin com.gradle.develocity to v3.19 ([#114](https://github.com/position-pal/user-service/issues/114)) ([c97a6c2](https://github.com/position-pal/user-service/commit/c97a6c2ec96b84dbfa2c1efa819a1f34394b5d41))
* **deps:** update plugin kotlin-dokka to v2 ([#117](https://github.com/position-pal/user-service/issues/117)) ([d48a86c](https://github.com/position-pal/user-service/commit/d48a86ca25808a6e202acec0bbc30b2841951e51))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.17 ([#111](https://github.com/position-pal/user-service/issues/111)) ([3f49e0b](https://github.com/position-pal/user-service/commit/3f49e0b3cbec6d1e0bfbcf0900c366670010fe90))
* **deps:** update postgres:17.2-alpine docker digest to d37d2c1 ([#108](https://github.com/position-pal/user-service/issues/108)) ([ff85fa5](https://github.com/position-pal/user-service/commit/ff85fa58a1ef832ccc742c76e5a0aa9438e72b53))
* **deps:** update proto to v4.29.0 ([#98](https://github.com/position-pal/user-service/issues/98)) ([f6a1a8b](https://github.com/position-pal/user-service/commit/f6a1a8b2e1b1d12ee22f2a58d3c5617b716b314b))
* **deps:** update proto to v4.29.1 ([#104](https://github.com/position-pal/user-service/issues/104)) ([4c1bdd1](https://github.com/position-pal/user-service/commit/4c1bdd1e6bbbd4775afd68906c281b73ce8185e0))
* **deps:** update proto to v4.29.2 ([#118](https://github.com/position-pal/user-service/issues/118)) ([be48009](https://github.com/position-pal/user-service/commit/be4800906f80ffafac77fc2357353dab6a3c3055))
* **deps:** update rabbitmq:4-management docker digest to 144d782 ([#112](https://github.com/position-pal/user-service/issues/112)) ([8a4ad25](https://github.com/position-pal/user-service/commit/8a4ad25376ba13cde9536489b17ebe28766014d1))
* **deps:** update rabbitmq:4-management docker digest to 4a2b95d ([#120](https://github.com/position-pal/user-service/issues/120)) ([9d7481c](https://github.com/position-pal/user-service/commit/9d7481cab61bf66e7124861f2bd26ce094e26753))
* **deps:** update rabbitmq:4-management docker digest to 4dc1302 ([#100](https://github.com/position-pal/user-service/issues/100)) ([51519b3](https://github.com/position-pal/user-service/commit/51519b359a3989fcc0ee8b1fea4fc4f1fe5c1d05))
* **deps:** update rabbitmq:4-management docker digest to 57513d2 ([#110](https://github.com/position-pal/user-service/issues/110)) ([7713120](https://github.com/position-pal/user-service/commit/77131201e7efb9213df742cb07d0af86aeea4a1c))
* **deps:** update rabbitmq:4-management docker digest to 8340b65 ([#106](https://github.com/position-pal/user-service/issues/106)) ([eb8dd0a](https://github.com/position-pal/user-service/commit/eb8dd0abbf99c367956c53f3e31a1112bbb16791))
* **deps:** update rabbitmq:4-management docker digest to b25420a ([#105](https://github.com/position-pal/user-service/issues/105)) ([5158c5f](https://github.com/position-pal/user-service/commit/5158c5fcce9a49b0088f3479359e9b7c3b599b94))
* **deps:** update rabbitmq:4-management docker digest to c0f5ae4 ([#101](https://github.com/position-pal/user-service/issues/101)) ([e7f29cc](https://github.com/position-pal/user-service/commit/e7f29cc4838e122642330c1cdc940eb292f80e72))

### Build and continuous integration

* **deps:** update actions/setup-java digest to 7a6d8a8 ([#116](https://github.com/position-pal/user-service/issues/116)) ([449680e](https://github.com/position-pal/user-service/commit/449680e11f909c3e34a43ada3100443d07ba67ab))

## [1.0.2](https://github.com/position-pal/user-service/compare/1.0.1...1.0.2) (2024-11-28)

### Dependency updates

* **core-deps:** update dependency org.jetbrains.kotlin.jvm to v2.1.0 ([#96](https://github.com/position-pal/user-service/issues/96)) ([d76ab28](https://github.com/position-pal/user-service/commit/d76ab282d33261ac36d472dca4a4a166292d6c74))
* **deps:** update dependency org.slf4j:slf4j-simple to v2.0.16 ([#94](https://github.com/position-pal/user-service/issues/94)) ([02781eb](https://github.com/position-pal/user-service/commit/02781ebfb71d2626cefcb30fd52fd1a4b9e8b37d))

## [1.0.1](https://github.com/position-pal/user-service/compare/1.0.0...1.0.1) (2024-11-25)

### Bug Fixes

* code repetition ([#95](https://github.com/position-pal/user-service/issues/95)) ([78c0926](https://github.com/position-pal/user-service/commit/78c092691f272a42abb7533acd48a79a62a84408))

## [1.0.0](https://github.com/position-pal/user-service/compare/0.4.0...1.0.0) (2024-11-25)

### ⚠ BREAKING CHANGES

* added entrypoint for user service startup  (#93)

### Features

* added entrypoint for user service startup  ([#93](https://github.com/position-pal/user-service/issues/93)) ([0c5dc5a](https://github.com/position-pal/user-service/commit/0c5dc5a5dcfe1c9a7ed5d1236c0981da0afc89e7))

### Dependency updates

* **deps:** pin rabbitmq docker tag to 5c3ead8 ([#84](https://github.com/position-pal/user-service/issues/84)) ([bf12d56](https://github.com/position-pal/user-service/commit/bf12d56d6879e4c2128333f032b8407780074cbd))
* **deps:** update dependency com.rabbitmq:amqp-client to v5.22.0 ([#85](https://github.com/position-pal/user-service/issues/85)) ([d9350d2](https://github.com/position-pal/user-service/commit/d9350d2f150f34247f6f56557f5b54a9ca30b9e6))
* **deps:** update dependency com.rabbitmq:amqp-client to v5.23.0 ([#88](https://github.com/position-pal/user-service/issues/88)) ([7f3ef84](https://github.com/position-pal/user-service/commit/7f3ef844de1794f3221407d2401df3db393a9a26))
* **deps:** update plugin com.gradle.develocity to v3.18.2 ([#87](https://github.com/position-pal/user-service/issues/87)) ([a1098ca](https://github.com/position-pal/user-service/commit/a1098cadc7fba7fc6462b10017eb90fe80ce6034))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.15 ([#89](https://github.com/position-pal/user-service/issues/89)) ([ee7e40b](https://github.com/position-pal/user-service/commit/ee7e40bbe6eb6fa909519811fcd1503bba733207))
* **deps:** update postgres docker tag to v17.2 ([#91](https://github.com/position-pal/user-service/issues/91)) ([f2cbcce](https://github.com/position-pal/user-service/commit/f2cbccec1a8866e82cace18b16c51f2ab55b4885))
* **deps:** update rabbitmq docker tag to v4 ([#86](https://github.com/position-pal/user-service/issues/86)) ([164d860](https://github.com/position-pal/user-service/commit/164d8603e890e1a8fe55c905ee687ef7f7666199))
* **deps:** update rabbitmq:4-management docker digest to 14c30a0 ([#90](https://github.com/position-pal/user-service/issues/90)) ([98d409c](https://github.com/position-pal/user-service/commit/98d409c3b5a9302997ba451df563d4b901995f96))

## [0.4.0](https://github.com/position-pal/user-service/compare/0.3.0...0.4.0) (2024-11-18)

### Features

* implemented adapter with rabbitmq for sending updates regarding groups ([#83](https://github.com/position-pal/user-service/issues/83)) ([b685875](https://github.com/position-pal/user-service/commit/b685875241879a1ce60b03879fc252bb474230ec))

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.112 ([c00b1aa](https://github.com/position-pal/user-service/commit/c00b1aa7b7857dfd156c864e2d8899f83800ea6c))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.113 ([4aa6061](https://github.com/position-pal/user-service/commit/4aa606165a33f30fa4a126f4cdc43f76bf3bfd39))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.114 ([340b045](https://github.com/position-pal/user-service/commit/340b0455b0a41b9ec529d73d45649867b8c565a3))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.115 ([#80](https://github.com/position-pal/user-service/issues/80)) ([4ac2c09](https://github.com/position-pal/user-service/commit/4ac2c09deeee204e970c676319b418db09cf57d2))
* **deps:** update grpc-java monorepo to v1.68.1 ([6050831](https://github.com/position-pal/user-service/commit/6050831a5fa4fbad59aeb23abdc595bacfacabac))
* **deps:** update ktor monorepo to v3.0.1 ([256ff81](https://github.com/position-pal/user-service/commit/256ff81c79a75994e3d58934aea2282b48eee0bb))
* **deps:** update node.js to v22 ([d0a2932](https://github.com/position-pal/user-service/commit/d0a293214abb15f6915fcdd7f557eff750188d96))
* **deps:** update plugin kotlin-qa to v0.69.0 ([a63f097](https://github.com/position-pal/user-service/commit/a63f09726106ddab5d212784dfba1b3a9c320733))
* **deps:** update postgres docker tag to v17.1 ([#82](https://github.com/position-pal/user-service/issues/82)) ([eed31f9](https://github.com/position-pal/user-service/commit/eed31f95361955c0ad9cc184e8143be2e74a4c2e))
* **deps:** update postgres:17.0-alpine docker digest to 3d5a606 ([#78](https://github.com/position-pal/user-service/issues/78)) ([83c1dcd](https://github.com/position-pal/user-service/commit/83c1dcd956e9841b3efbc55f540394ba420f4af8))
* **deps:** update postgres:17.0-alpine docker digest to 72ff2e0 ([#77](https://github.com/position-pal/user-service/issues/77)) ([8e542cf](https://github.com/position-pal/user-service/commit/8e542cfc5585efa05170a0ad29a6a330294a90fc))
* **deps:** update proto to v4.28.3 ([39f5863](https://github.com/position-pal/user-service/commit/39f5863386c4177de813739c5730f7c889447971))

### Build and continuous integration

* **deps:** update actions/checkout digest to 11bd719 ([21cbb34](https://github.com/position-pal/user-service/commit/21cbb341ae5dcf37560e5c194f02b8646f1f5ae7))
* **deps:** update actions/setup-java digest to 8df1039 ([d159726](https://github.com/position-pal/user-service/commit/d159726dc21b5706f8a76e50a028975effc73df1))
* **deps:** update actions/setup-node action to v4.1.0 ([4bca0fa](https://github.com/position-pal/user-service/commit/4bca0faa7742e26767c61e1b2c9b27e6e87e4f8f))

## [0.3.0](https://github.com/position-pal/user-service/compare/0.2.0...0.3.0) (2024-10-22)

### Features

* **auth:** implemented authentication with jwt ([#65](https://github.com/position-pal/user-service/issues/65)) ([c1e5c1a](https://github.com/position-pal/user-service/commit/c1e5c1a57eea1923215fbe8cf97c81edb77d33e3))

### Dependency updates

* **deps:** pin postgres docker tag to 578ca5c ([e7fcc26](https://github.com/position-pal/user-service/commit/e7fcc2670d6432100466d3149efa5bbadea33d2f))
* **deps:** update dependency io.github.cdimascio:dotenv-kotlin to v6.4.2 ([ea5c4e5](https://github.com/position-pal/user-service/commit/ea5c4e5a6645b89f79c357b737135dd6210895d4))
* **deps:** update dependency io.mockk:mockk to v1.12.8 ([c561403](https://github.com/position-pal/user-service/commit/c561403d387b640d820e435d740580f8d139065b))
* **deps:** update dependency io.mockk:mockk to v1.13.13 ([02eda35](https://github.com/position-pal/user-service/commit/02eda355f696bcb370f8558833084799581a4dac))
* **deps:** update dependency org.postgresql:postgresql to v42.7.4 ([af3fd15](https://github.com/position-pal/user-service/commit/af3fd1550ef3505fc6969956198bb66f62d1137b))
* **deps:** update ktorm to v3.6.0 ([c65bfe7](https://github.com/position-pal/user-service/commit/c65bfe79b4731df4119d36aa71ff981c447bffed))
* **deps:** update ktorm to v4 ([e54b84c](https://github.com/position-pal/user-service/commit/e54b84cf052664646a791cee9448cbd08ad19c50))
* **deps:** update postgres docker tag to v14.13 ([45f7009](https://github.com/position-pal/user-service/commit/45f700920655d5ed605851b9cbf9a7812c51e231))
* **deps:** update postgres docker tag to v17 ([7c96708](https://github.com/position-pal/user-service/commit/7c967087e6304fdda972f6e54ec6d692657a8783))

## [0.2.0](https://github.com/position-pal/user-service/compare/v0.1.0...0.2.0) (2024-10-17)

### Features

* **postgres:** adding repositories for managing users and groups using a postgres db ([#49](https://github.com/position-pal/user-service/issues/49)) ([929299f](https://github.com/position-pal/user-service/commit/929299fd9bd9dbf40197d8e0fd2adfc37101938b))

### Dependency updates

* **deps:** update dependency org.jetbrains.kotlin.jvm to v2.0.21 ([0ac2815](https://github.com/position-pal/user-service/commit/0ac28155c915ee22fe2fadc57fc34c84d3bee31e))
* **deps:** update dependency org.mockito:mockito-core to v5.14.0 ([fbd7c48](https://github.com/position-pal/user-service/commit/fbd7c48ebd215c4a1c0f825383c4bcd15c641f76))
* **deps:** update dependency org.mockito:mockito-core to v5.14.1 ([57ec479](https://github.com/position-pal/user-service/commit/57ec4799135c4a6d4edfe1bebecaf78f2ba5d100))
* **deps:** update dependency org.mockito:mockito-core to v5.14.2 ([97a3681](https://github.com/position-pal/user-service/commit/97a3681e1d8fbd5189ccc1cecc0784fe50924bea))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.108 ([cc24ceb](https://github.com/position-pal/user-service/commit/cc24ceb6232a3d883969b143277266d4b770a931))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.109 ([3322a99](https://github.com/position-pal/user-service/commit/3322a99ff2d361e8c0f843b6b8292baca16b2f5e))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.110 ([485cb4f](https://github.com/position-pal/user-service/commit/485cb4fcfffe454ca43d1c8eb23081ddd3f26f94))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.111 ([1cf6956](https://github.com/position-pal/user-service/commit/1cf6956442ee770ffe968b24c9e040baa1da4cdb))
* **deps:** update node.js to 20.18 ([7f2a080](https://github.com/position-pal/user-service/commit/7f2a080cbf54110f21bc2af90107368a7bc73a68))
* **deps:** update plugin kotlin-qa to v0.67.3 ([b0276fa](https://github.com/position-pal/user-service/commit/b0276fac01912110b390ace1604126e6d1c1022d))
* **deps:** update plugin kotlin-qa to v0.68.0 ([922f809](https://github.com/position-pal/user-service/commit/922f8091b87530cd1b175686fe370701e449898f))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.13 ([952df7d](https://github.com/position-pal/user-service/commit/952df7d00c9475dd73f3a375d6c2fd5680dc4805))

### Build and continuous integration

* **deps:** update actions/checkout digest to eef6144 ([cb71030](https://github.com/position-pal/user-service/commit/cb7103064556670852afdd2d20b18b2988d44f7d))
* **deps:** update dependency ubuntu to v24 ([71b3ec7](https://github.com/position-pal/user-service/commit/71b3ec7aa0c2250b47f77e18a8137aa900e9894a))
* do not execute checks against generated code ([#44](https://github.com/position-pal/user-service/issues/44)) ([80de1b3](https://github.com/position-pal/user-service/commit/80de1b3f8572d45178ef567752f74e8423d25134))

### Refactoring

* **grpc:** switch to kotlin implementation of grpc ([#37](https://github.com/position-pal/user-service/issues/37)) ([03338ee](https://github.com/position-pal/user-service/commit/03338eec6f6ae4da30e1c0390bcf514f4eea5012))

## [1.1.0](https://github.com/position-pal/user-service/compare/1.0.0...1.1.0) (2024-09-22)

### Features

* **group:** added support for creating and managing groups with protobuf and grpc ([#32](https://github.com/position-pal/user-service/issues/32)) ([b96ee72](https://github.com/position-pal/user-service/commit/b96ee724539efa7b5eb0540d3dd52be4d4f49907))

### Dependency updates

* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.107 ([24613af](https://github.com/position-pal/user-service/commit/24613af45fda4c664d9aba590b75e7b918ea5428))
* **deps:** update grpc-java monorepo to v1.51.3 ([f3b19cd](https://github.com/position-pal/user-service/commit/f3b19cd0f983f73a5b5d19c20334e7ba008c3779))
* **deps:** update grpc-java monorepo to v1.68.0 ([21d6bd6](https://github.com/position-pal/user-service/commit/21d6bd69b66a2fbf9650996e75485d545e1da81e))
* **deps:** update proto to v3.21.12 ([ed8e3bd](https://github.com/position-pal/user-service/commit/ed8e3bd6e84e8df8b18443582973ff636d123f5e))
* **deps:** update proto to v3.25.5 ([efe9ad3](https://github.com/position-pal/user-service/commit/efe9ad3824053877aa1356ec467b84597d6a147e))
* **deps:** update proto to v4 ([c8b7f06](https://github.com/position-pal/user-service/commit/c8b7f06ac3e3d068a693190536eeacfe20dc0a14))

## 1.0.0 (2024-09-21)

### Features

* **user:** user service with protobuf and grpc ([#26](https://github.com/position-pal/user-service/issues/26)) ([bec3589](https://github.com/position-pal/user-service/commit/bec35892f3d4e0468a09cf1e705b329c6714bc19))

### Dependency updates

* **deps:** update dependency gradle to v8.10 ([0fbfbd0](https://github.com/position-pal/user-service/commit/0fbfbd0236c4976c916cced7d3792385a92cdee7))
* **deps:** update dependency gradle to v8.10.1 ([b724d75](https://github.com/position-pal/user-service/commit/b724d75969299621f04cb52c0e887896665dfa83))
* **deps:** update dependency org.mockito:mockito-core to v5.13.0 ([cf66fa2](https://github.com/position-pal/user-service/commit/cf66fa26f10bc008c321192e619e59c7b36d0cef))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.101 ([4ffecf9](https://github.com/position-pal/user-service/commit/4ffecf99ac4dd760440c582ea55d2555d5f13dc3))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.102 ([7f6916b](https://github.com/position-pal/user-service/commit/7f6916bf88135604fad7bb82901617ea24aedae2))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.103 ([5e34f6a](https://github.com/position-pal/user-service/commit/5e34f6aafae3df928293de35bca6314dbfa22566))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.104 ([792956d](https://github.com/position-pal/user-service/commit/792956d2f474dac091bb73638f1031d09526412b))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.105 ([9726af9](https://github.com/position-pal/user-service/commit/9726af94330babaa777609cdd3c9302d4e88aaba))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.106 ([36b2970](https://github.com/position-pal/user-service/commit/36b297063ce13cce1818127c44b3132f572c2dc0))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.96 ([1c4734a](https://github.com/position-pal/user-service/commit/1c4734aeca2fe2f5bc93e320c24e00ebe9c09699))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.98 ([a64f154](https://github.com/position-pal/user-service/commit/a64f154fe29ad6e3dc2d7be69252937eb1857241))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.99 ([5dafbd1](https://github.com/position-pal/user-service/commit/5dafbd1631cd9c1604136e47e04a43483a34872b))
* **deps:** update kotlin monorepo to v2.0.20 ([d5deede](https://github.com/position-pal/user-service/commit/d5deedefc5b787df5cf823146c7ac26f47ec4b37))
* **deps:** update node.js to 20.17 ([0552644](https://github.com/position-pal/user-service/commit/05526444901116872854d3aad7ba5e06250df5ca))
* **deps:** update plugin com.gradle.develocity to v3.18 ([ca64d9c](https://github.com/position-pal/user-service/commit/ca64d9c1049f9f5d037781222bbb81c4b5b3769d))
* **deps:** update plugin com.gradle.develocity to v3.18.1 ([dbd1aa7](https://github.com/position-pal/user-service/commit/dbd1aa7f8ee61c3e710596ae5ea9b0baec3fd996))
* **deps:** update plugin kotlin-qa to v0.65.2 ([3a8fa55](https://github.com/position-pal/user-service/commit/3a8fa5581f057935fb0c6c8175b29748b1c7cf2d))
* **deps:** update plugin kotlin-qa to v0.67.1 ([057ef68](https://github.com/position-pal/user-service/commit/057ef686a53b2377a74739617a22f96b89b75dba))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.12 ([8fb00bf](https://github.com/position-pal/user-service/commit/8fb00bfcd56d28fcfef1f8455dbb63a5135d8994))
* **deps:** update plugin org.danilopianini.gradle-pre-commit-git-hooks to v2.0.9 ([8f80ed9](https://github.com/position-pal/user-service/commit/8f80ed9379f47addae0cb037bf3950bfced93132))

### Build and continuous integration

* **deps:** update actions/setup-java digest to 2dfa201 ([4d58981](https://github.com/position-pal/user-service/commit/4d589814e9083345fd2c0bee61eb50d248cbd5d3))
* **deps:** update actions/setup-node action to v4.0.4 ([40aaaa7](https://github.com/position-pal/user-service/commit/40aaaa7fca8e793e01377d84bfec352755ebdc97))

### General maintenance

* update readme ([0b1ae96](https://github.com/position-pal/user-service/commit/0b1ae96e854ee98e5383590709d1bb1461715da8))

## 1.0.0 (2024-07-09)

### Dependency updates

* **deps:** update dependency gradle to v8.8 ([932f746](https://github.com/position-pal/kotlin-template/commit/932f746ca9bc232809121e1f1adbb21c83dd1dfb))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.86 ([#13](https://github.com/position-pal/kotlin-template/issues/13)) ([74fa461](https://github.com/position-pal/kotlin-template/commit/74fa461e00d589e39f284b07f560831d16b888a8))
* **deps:** update dependency semantic-release-preconfigured-conventional-commits to v1.1.87 ([#14](https://github.com/position-pal/kotlin-template/issues/14)) ([06cfe7a](https://github.com/position-pal/kotlin-template/commit/06cfe7a1025228a9549065a1dfe25783dfa28da0))
* **deps:** update node.js to 20.15 ([#11](https://github.com/position-pal/kotlin-template/issues/11)) ([227a513](https://github.com/position-pal/kotlin-template/commit/227a513f1017b703aba0f90bdbab7a8abc96face))

### Documentation

* Addition of automatic generation of documentation  ([#15](https://github.com/position-pal/kotlin-template/issues/15)) ([3e4021d](https://github.com/position-pal/kotlin-template/commit/3e4021dc118b058e0ba17742b8b9c0d1df22380d))

### Build and continuous integration

* **deps:** pin dependencies ([c3b47c2](https://github.com/position-pal/kotlin-template/commit/c3b47c2267845db211b450041c1624720af8321f))
* **deps:** pin dependencies ([#10](https://github.com/position-pal/kotlin-template/issues/10)) ([8460f5e](https://github.com/position-pal/kotlin-template/commit/8460f5e67f70c741ec8fee94f514cb068e1cadfa))
* **deps:** pin dependencies ([#16](https://github.com/position-pal/kotlin-template/issues/16)) ([0facc7e](https://github.com/position-pal/kotlin-template/commit/0facc7ec98d4a636b1e9eba36ebcfdd91713cec5))
* **deps:** update actions/checkout action to v4 ([#17](https://github.com/position-pal/kotlin-template/issues/17)) ([420a43a](https://github.com/position-pal/kotlin-template/commit/420a43af202c34982c801247ed12522ac5c4c7c7))
* **deps:** update actions/setup-java action to v4 ([#18](https://github.com/position-pal/kotlin-template/issues/18)) ([aa8d773](https://github.com/position-pal/kotlin-template/commit/aa8d7730a330bba6d090b97a0a30dce9c436b01a))
* PP-16 integration with Mergify ([#6](https://github.com/position-pal/kotlin-template/issues/6)) ([85d0c02](https://github.com/position-pal/kotlin-template/commit/85d0c021db91683dfd2a82e5fd8ab4910bf9cc00))
* PP-17 sem release, update needs for workflow  ([#12](https://github.com/position-pal/kotlin-template/issues/12)) ([397851a](https://github.com/position-pal/kotlin-template/commit/397851a120c64bd452efaeeac448beac582730e8))
* treat warnings as errors and rename plugin name ([f3c949a](https://github.com/position-pal/kotlin-template/commit/f3c949a0808ce4f1c3b4db22e2f6353d0136cbde))
* update ci and mergify ([#8](https://github.com/position-pal/kotlin-template/issues/8)) ([b8565cb](https://github.com/position-pal/kotlin-template/commit/b8565cb882c6f0868ff59dc0a4373391a3db607c))

### General maintenance

* add support for submodules ([ca0759b](https://github.com/position-pal/kotlin-template/commit/ca0759b96d08996598fe1471b6cccc7e27301916))
* configure renovate ([817bfe8](https://github.com/position-pal/kotlin-template/commit/817bfe8691bf7a4215e3df204a6bdf13ac93c259))
* initial commit ([9c44e67](https://github.com/position-pal/kotlin-template/commit/9c44e6791c10d7523585c70f29d23bdde12a2fc6))
* mergify configuration file added ([c61ad89](https://github.com/position-pal/kotlin-template/commit/c61ad895e4189f551b35c92e79dfea59fe2bd622))
* **mergify:** require label rebase to automatically rebase ([3804e25](https://github.com/position-pal/kotlin-template/commit/3804e25b8b914a18ca9505155bb77a75632513f4))
* **readme:** add readme title and simple description ([fd33402](https://github.com/position-pal/kotlin-template/commit/fd334027e99c489120107102fe06c6c8cb616a40))
* remove maxHeapSize limitation ([f40f653](https://github.com/position-pal/kotlin-template/commit/f40f653651ae0c6b7629dab8cfa1883a4a05a884))
* test Mergify Implementation ([7850d87](https://github.com/position-pal/kotlin-template/commit/7850d8705e580043854aa4855bcd89416c59eb92))

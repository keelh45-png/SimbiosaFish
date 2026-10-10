# SimbiosaFish Add-on starter

This is a **starter project**, not a finished gameplay add-on. It intentionally does not yet alter fishing gameplay.

## Intended features
- Per-item catch quotas: Basic 50, Iron 75, Diamond 100, Emerald 150, Mythic 200.
- Persistent remaining quota on each custom rod.
- Remove custom rod when quota reaches zero.
- Require EMF-attached bait for custom rods.
- Avoid vanilla rod durability loss for custom rods.

## Important compatibility notes
- The Paper API dependency currently targets 1.21.4 for a reproducible baseline. It has **not** been verified against Paper 26.2.
- Put `EvenMoreFish-2.4.6.jar` in `libs/` before building if compiling against its classes. The current starter does not yet call EMF classes.
- The EMF API and bait NBT access must be inspected before gameplay listeners are implemented.
- Do not install this starter on a live server expecting quotas to work. It only confirms the plugin scaffold can load if built successfully.

## Build
Use Java 21 and Gradle:
`gradle build`

GitHub Actions can build this project when pushed to `main`; download the artifact from the workflow run.

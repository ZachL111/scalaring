# Scalaring Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | quorum health | 149 | ship |
| stress | lease drift | 167 | ship |
| edge | replica lag | 145 | ship |
| recovery | membership churn | 149 | ship |
| stale | quorum health | 217 | ship |

Start with `stale` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `edge` becomes less cautious without a clear reason, I would inspect the drag input first.

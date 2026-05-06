# Review Journal

The repository goal stays the same: simulate actor ring routing and failure detection traces. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its distributed systems focus without claiming live deployment or external usage.

## Cases

- `baseline`: `quorum health`, score 149, lane `ship`
- `stress`: `lease drift`, score 167, lane `ship`
- `edge`: `replica lag`, score 145, lane `ship`
- `recovery`: `membership churn`, score 149, lane `ship`
- `stale`: `quorum health`, score 217, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.

* 
* alliance coordination

Examples of units using Gandalf:

* the Army of Gondor
* the Riders of Rohan
* the Elven battalions of Rivendell
* the Fellowship scouts

Each unit may call something like:

<pre class="overflow-visible! px-0!" data-start="512" data-end="557"><div class="relative w-full mt-4 mb-1"><div class=""><div class="relative"><div class="h-full min-h-0 min-w-0"><div class="h-full min-h-0 min-w-0"><div class="border border-token-border-light border-radius-3xl corner-superellipse/1.1 rounded-3xl"><div class="h-full w-full border-radius-3xl bg-token-bg-elevated-secondary corner-superellipse/1.1 overflow-clip rounded-3xl lxnfua_clipPathFallback"><div class="pointer-events-none absolute end-1.5 top-1 z-2 md:end-2 md:top-1"></div><div class="pe-11 pt-3"><div class="relative z-0 flex max-w-full"><div id="code-block-viewer" dir="ltr" class="q9tKkq_viewer cm-editor z-10 light:cm-light dark:cm-light flex h-full w-full flex-col items-stretch ͼk ͼy"><div class="cm-scroller"><div class="cm-content q9tKkq_readonly"><span>Gandalf.getInstance().issueOrder(...)</span></div></div></div></div></div></div></div></div></div><div class=""><div class=""></div></div></div></div></div></pre>

But the world must  **never accidentally create two Gandalfs** , because that would cause chaos:

* two conflicting battle plans
* different commands sent to different armies
* inconsistent strategic decisions

So the design requirement becomes:

"There must be exactly one Gandalf coordinating the war, and every army must access the same Gandalf."

This is exactly the problem the **Singleton pattern** solves:

* enforce **only one instance** of Gandalf
* provide **global access** to him
